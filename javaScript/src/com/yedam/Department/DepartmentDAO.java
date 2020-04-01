package com.yedam.Department;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {

	Connection conn = null;
	
	public DepartmentDAO() {
		
		String user = "hr"; 
		String pass = "hr"; 
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			conn = DriverManager.getConnection(url, user, pass); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Department> getDepartmentList(){
		String sql = "SELECT * FROM DEPARTMENTS";
		List<Department> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				Department d = new Department();
				d.setDepartmentid(rs.getInt("department_id"));
				d.setDepartmentname(rs.getString("department_name"));
				d.setManagerid(rs.getInt("manager_id"));
				d.setLocationid(rs.getInt("location_id"));
				
				list.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;
		}
	
	
}
