package com.yedam.dev;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetEmpListServlet")
public class GetEmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) // get방식이 요청이 들어오면 doget 호출
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath()).append("HJW");
		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
		// [{"id":1,"first_name":"Hastings","last_name":"Jolliman",
//		"email":"hjolliman0@netscape.com","gender":"Male","ip_address":"110.215.189.135"},]
		String empJson = "[";
		int rCnt = 0;
		int totalCnt = empList.size(); //데이터 건수 조회
		for (Employee e : empList) {
			empJson += "{\"empId\":" + e.getEmployeeId() 
            + ",\"firstName\":\"" + e.getFirstName() 
            + "\",\"lastName\":\"" + e.getLastName()
            + "\",\"salary\":\"" + e.getSalary()
            + "\"}";
			if(++rCnt != totalCnt)
			empJson += ",";
		}
		empJson += "]";
		PrintWriter out = response.getWriter();
		out.print(empJson.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) // post방식 요청 들어오면 dopost 호출
			throws ServletException, IOException {
		doGet(request, response);
	}

}
