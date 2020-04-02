package com.yedam.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.dev.Employee;

public class EmpDAO {
	Connection conn = null;

	public EmpDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // localhost: ?? : ?? <다른컴에서 사용할때 ?만 바꾸면 된다.>
		String user = "hr";
		String pass = "hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				conn = DriverManager.getConnection(url, user, pass);
				System.out.println("정상 연결되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("정상 연결이 되지 않았습니다.");
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	public List<Student> getEmpList() {// 전체 조회
		// firstName = name , salary = age, email = school
		String sql = "Select first_name, salary, email FROM employees";
		List<Student> list = new ArrayList<>();
		PreparedStatement psmt;
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Student s1 = new Student(rs.getString("first_name"), rs.getInt("salary"), rs.getString("email"));
				list.add(s1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public Student getStudentInfo(int id) {// 한건조회
		String sql = "SELECT first_name, salary, email FROM employees WHERE employee_id = ?";
		Student stud = new Student();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				stud.setName(rs.getString("first_name"));
				stud.setAge(rs.getInt("salary"));
				stud.setSchool(rs.getString("email"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stud;

	}

}
