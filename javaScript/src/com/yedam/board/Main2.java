package com.yedam.board;

import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		BoardDAO b = new BoardDAO();
		List<Board> blist = b.getBoardList();
		for(Board board : blist) {
			System.out.println(board);
		}
		Board board = new Board();
		board.setWriter("user1");
		board.setContent("java test");
		
		b.insertBoard(board);
	}
}
