package com.yedam.country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO {
	Connection conn = null;

	public CountryDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "hr";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				conn = DriverManager.getConnection(url, user, pass);
				System.out.println("정상 연결");
			} catch (SQLException e) {
				System.out.println("비정상연결");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public List<Country> getCountryList() {
		String sql = "SELECT * FROM countries";
		List<Country> list = new ArrayList();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {//Country_Id , Country_Name , Region_Id
				Country ct = new Country(rs.getString("country_id"), rs.getString("country_name"), rs.getInt("region_id"));
				list.add(ct);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return list;
	}
}
