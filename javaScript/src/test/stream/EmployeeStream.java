package test.stream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeStream {
	public static void main(String[] args) {
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
			stream.forEach((s) -> System.out.println(s.getFirstName() + " " + s.getSalary()));

			
			
	}//end of main
}
