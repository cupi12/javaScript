package com.yedam.Department;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/GetDepartmentListServlet")
public class GetDepartmentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public GetDepartmentListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		JSONObject obj = new JSONObject();
		JSONArray ary = new JSONArray();
		DepartmentDAO dao = new DepartmentDAO();
		for(Department d : dao.getDepartmentList()) {
			obj.put("department_id", d.getDepartmentid());
			obj.put("department_name", d.getDepartmentname());
			obj.put("manager_id", d.getManagerid());
			obj.put("location_id", d.getLocationid());
			ary.add(obj);
		}
		PrintWriter out = response.getWriter();
		out.print(ary.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
