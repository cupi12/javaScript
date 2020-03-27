package com.yedam.board;

public class Board {
int boardno;
String writer, content, createdate;
public int getBoardno() {
	return boardno;
}
public void setBoardno(int boardno) {
	this.boardno = boardno;
}
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getCreatedate() {
	return createdate;
}
public void setCreatedate(String createdate) {
	this.createdate = createdate;
}
@Override
public String toString() {
	return "Board [boardno=" + boardno + ", writer=" + writer + ", content=" + content + ", createdate=" + createdate
			+ "]";
}


}
