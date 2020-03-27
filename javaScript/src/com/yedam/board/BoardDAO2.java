package com.yedam.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO2 {
	 
	Connection conn = null;

	public BoardDAO2() {
		String user ="hr";
		String pass = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {// 읽기 쓰기를 하는 작업에는 반드시 예외처리를 해줘야함
			Class.forName("oracle.jdbc.driver.OracleDriver"); // oracle 라이브러리 주소
			conn = DriverManager.getConnection(url, user, pass); // 접속을 하는 명령어
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}
	
	public List<Board> getBoardList(){
		String sql = "Select * from Board";
		List<Board> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql); // 오라클에서 해석해서 담음
			ResultSet rs = pstmt.executeQuery(); // executeQuery:쿼리를 처리함. ResultSet에 결과값 담음
			while (rs.next()) {
				Board b = new Board();
				b.setBoardno(rs.getInt("board_no"));
				b.setContent(rs.getString("content"));
				b.setCreatedate(rs.getString("create_date"));
				b.setWriter(rs.getString("writer"));
				
				list.add(b);
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list; //*주의
	}
	public void insertBoard(Board b) {
		String sql = "insert into board \r\n" + 
				"values( (select nvl(max(board_no),0)+1 from board)\r\n" + 
				"         , ? -- 글내용\r\n" + 
				"         , ?  -- 작성자\r\n" + 
				"         , sysdate)"; 
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getContent());
			pstmt.setString(2, b.getWriter());
			int iCnt = pstmt.executeUpdate();
			System.out.println(iCnt + "건 입력");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}

