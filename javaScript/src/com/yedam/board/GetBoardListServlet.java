package com.yedam.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/GetBoardListServlet")
public class GetBoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetBoardListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		BoardDAO dao = new BoardDAO();
//		List<Board> boardList = dao.getBoardList();
//		String boardJson="[";
//		int rCnt=0;
//		int totalCnt = boardList.size();
//		for(Board b : boardList) {
//		boardJson="{\"boardNo\":"+ b.getBoardno()
//		+",\"content\":" + b.getWriter()
//		+",\"writer\":" + b.getContent()
//		+",\"create_date\":" + b.getCreatedate()
//		+"\"}";
		JSONObject obj = new JSONObject();
		JSONArray ary = new JSONArray();
		BoardDAO dao = new BoardDAO();
		for (Board b : dao.getBoardList()) {
			obj.put("board_No", b.getBoardno());
			obj.put("content", b.getContent());
			obj.put("Writer", b.getWriter());
			obj.put("Create_Date", b.getCreatedate());
			ary.add(obj);
		}
		PrintWriter out = response.getWriter();
		out.print(ary.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
