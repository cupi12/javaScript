package test.stream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class EmployeeFile {
	public static void main(String[] args) throws IOException {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String user = "hr";
		String passwd = "hr";

		Connection conn = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, passwd);
		} catch (ClassNotFoundException e) {
			System.out.println("정상적인 드라이버가 아닙니다.");
		} catch (SQLException e) {
			System.out.println("접속 정보를 확인하세요.");
		}

		ArrayList<Employee> list = new ArrayList<>();
	
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT first_name, salary FROM employees");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
			list.add(new Employee(rs.getString("first_name"),
					rs.getInt("salary")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			Stream<Employee> stream = list.stream();
		
			
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		FileOutputStream fos = new FileOutputStream("src/test/stream/employees.txt");
		FileWriter w = new FileWriter(stream/Employee.java);
		for(Employee emp : list) {
			
		}
		fos.flush();
		fos.close();
		
	}//end of main

}//end of class
