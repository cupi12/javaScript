<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getData.jsp</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String name= request.getParameter("myname");
		String major=request.getParameter("major");
		out.print("이름은 : " + name + ", 전공은 : " + major);	
	%> 

</body>
</html>