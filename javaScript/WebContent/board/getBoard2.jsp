<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "com.yedam.board.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String bNo = request.getParameter("boardNo");
BoardDAO dao = new BoardDAO();
Board b = dao.getBoardInfo(Integer.parseInt(bNo));
%>
<table border=1>
<tr>
<td>Board_No</td><td><%=bNo %></td>
</tr>
<tr>
<td>Content</td><td><%=b.getContent() %></td>
</tr>
<tr>
<td>Writer</td><td><%=b.getWriter() %></td>
</tr>
<tr>
<td>Create_Date</td><td><%=b.getCreatedate() %></td>
</tr>
</table>
</body>
</html>