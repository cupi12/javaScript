package com.yedam.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	Connection conn = null;

	public EmpDAO() { //SQL 연결 메서드
		String user = "hr"; // SQL id
		String pass = "hr"; // SQL pw
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // SQL url
		try {// 읽기 쓰기를 하는 작업에는 반드시 예외처리를 해줘야함
			Class.forName("oracle.jdbc.driver.OracleDriver"); // oracle 라이브러리 주소
			conn = DriverManager.getConnection(url, user, pass); // 접속을 하는 령어
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Employee> getEmpList() {
		String sql = "select * from Employees";
		List<Employee> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql); // 오라클에서 해석해서 담음
			ResultSet rs = pstmt.executeQuery(); // executeQuery:쿼리를 처리함. ResultSet에 결과값 담음
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));// getInt:int타입으로 데이터를 가져오겠다.
				emp.setFirstName(rs.getString("first_name"));// getS~:String타입으로 데이터를 가져오겠다.""안에는DB의 칼럼명 가져와야함
				emp.setLastName(rs.getString("last_name"));
				emp.setDepartmentId(rs.getInt("department_id"));
				emp.setPhoneNumber(rs.getString("phone_Number"));
				emp.setEmail(rs.getString("email"));				
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommission_pct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				
				list.add(emp);
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list; //*주의
	}
}
