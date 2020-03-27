package com.yedam.dev;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.Board;
import com.yedam.board.BoardDAO;


@WebServlet("/InsertBoardServlet")
public class InsertBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      public InsertBoardServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		String boardNo = request.getParameter("board_no");
		String writer = request.getParameter("writer");
		String content = request.getParameter("Content");
		System.out.println("writer : " + writer
							+ ", Content : " + content);
		
		Board brd = new Board(); //SQL 값 확인
		brd.setWriter(writer);
		brd.setContent(content);
		BoardDAO boardDAO = new BoardDAO(); //SQL넣기위함
		boardDAO.insertBoard(brd);
		
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
