package com.yedam.board;

import java.util.List;

public class Main {
	public static void main(String[] args) {
//		BoardDAO b = new BoardDAO();
//		List<Board> blist = b.getBoardList();
//		for(Board board : blist) {
//			System.out.println(board);
//		}
//		Board board = new Board();
//		board.setWriter("user1");
//		board.setContent("java test");
//		
//		b.insertBoard(board);
		
		BoardDAO b = new BoardDAO();
		Board brd = b.getBoardInfo(3);
		System.out.println(brd);
			
		
	}
}
