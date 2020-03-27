package com.yedam.board;

public class Board2 {
int board_no;
String content2, writer2, create_date;
public int getBoard_no() {
	return board_no;
}
public void setBoard_no(int board_no) {
	this.board_no = board_no;
}
public String getContent2() {
	return content2;
}
public void setContent2(String content2) {
	this.content2 = content2;
}
public String getWriter2() {
	return writer2;
}
public void setWriter2(String writer2) {
	this.writer2 = writer2;
}
public String getCreate_date() {
	return create_date;
}
public void setCreate_date(String create_date) {
	this.create_date = create_date;
}
@Override
public String toString() {
	return "Board2 [board_no=" + board_no + ", content2=" + content2 + ", writer2=" + writer2 + ", create_date="
			+ create_date + "]";
}


}
