package com.yedam.dev;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet == 데이터와 html 사이를 연결해줌.
@WebServlet("/InsertEmpServlet")
public class InsertEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertEmpServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath()); //doGet default 값들 주석처리한것
		String lastname = request.getParameter("lastname"); //요청하는 화면에서 3개의 데이터를 넘겨서 확인함
		String email = request.getParameter("email");
		String jobId = request.getParameter("jobId");
		System.out.println("lastname : " + lastname 
							+ ", email : " + email 
							+ ", JobId : " + jobId);
		//데이터베이스 입력처리
		Employee emp = new Employee();
		emp.setLastName(lastname);
		emp.setEmail(email);
		emp.setJobId(jobId);
		EmpDAO dao = new EmpDAO();
		dao.insertEmp(emp);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
