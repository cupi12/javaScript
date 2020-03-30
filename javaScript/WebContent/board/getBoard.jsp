<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.yedam.board.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//java문법을 쓸 수 있도록 함 
		String bNo = request.getParameter("boardNo");
		BoardDAO dao = new BoardDAO();
		Board b = dao.getBoardInfo(Integer.parseInt(bNo));//Integer.parseInt == 문자열 안에 들어 있는 Int타입으로 변환시킴
	%>
	<h1>
		<a href="getBoardList.html">Board List</a>
	</h1>

	<%
		out.print("<h1>boardNo = " + bNo + "</h1>");
		out.print("<h1>content = " + b.getContent() + "</h1>");
		out.print("<h1>Writer = " + b.getWriter() + "</h1>");
		out.print("<h1>CreateDate = " + b.getCreatedate() + "</h1>");
		out.print("<a href=\"getBoardList.html\">List</a>");
		out.print("<table border=1");
		out.print("<tr><td>" + "BoardNo" + "</td>" + "<td>" + bNo + "</td></tr>");
		out.print("<tr><td>" + "Content" + "</td>" + "<td>" + b.getContent() + "</td></tr>");
		out.print("<tr><td>" + "Writer" + "</td>" + "<td>" + b.getWriter() + "</td></tr>");
		out.print("<tr><td>" + "CreateDate" + "</td>" + "<td>" + b.getCreatedate() + "</td></tr>");
		out.print("</table>");
	%>
	<br>

	<table border="1">
		<tr>
			<td>Board_No</td>
			<td><%=bNo%></td>
		</tr>
		<tr>
			<td>Content</td>
			<td><%=b.getContent()%></td>
		</tr>
		<tr>
			<td>Writer</td>
			<td><%=b.getWriter()%></td>
		</tr>
		<tr>
			<td>Create_Date</td>
			<td><%=b.getCreatedate()%></td>
		</tr>
	</table>

</body>
</html>