package project.model;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class HealthDAO implements Initializable {

	Connection conn = null;
	String user = "hr";
	String pass = "hr";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";

	HealthDO healthDo = new HealthDO();
	// 조회기능
	PreparedStatement pstmt;

	public HealthDO selectOne(HealthDO health) {
		try {
			conn = DriverManager.getConnection(url, user, pass);
			pstmt = conn.prepareStatement("SELECT * FROM HealthEmp where name =?");
			pstmt.setString(1, health.getName());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				healthDo.setName(rs.getString("name"));
				healthDo.setPhoneNum(rs.getString("phonenum"));
				healthDo.setGender(rs.getString("gender"));
				healthDo.setDivision(rs.getString("division"));
				healthDo.setBirth(rs.getString("birth"));
				healthDo.setMoney(rs.getString("money"));
				healthDo.setCard(rs.getString("card"));
				healthDo.setTotal(rs.getString("total"));

			} // end of while
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return healthDo;
	}// end of getHealthEmp()

	public ArrayList<HealthDO> selectAll() {// 전체조회
		ArrayList<HealthDO> list = new ArrayList<HealthDO>();
		try {
			conn = DriverManager.getConnection(url, user, pass);
			pstmt = conn.prepareStatement("SELECT * FROM HealthEmp");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				healthDo.setName(rs.getString("name"));
				healthDo.setPhoneNum(rs.getString("phonenum"));
				healthDo.setGender(rs.getString("gender"));
				healthDo.setDivision(rs.getString("division"));
				healthDo.setBirth(rs.getString("birth"));
				healthDo.setMoney(rs.getString("money"));
				healthDo.setCard(rs.getString("card"));
				healthDo.setTotal(rs.getString("total"));
				list.add(healthDo);

			} // end of while
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}// end of getHealthEmp()

	// 등록기능
	@FXML
	public void insertHealthEmp(HealthDO healthDo) {
		try {
			conn = DriverManager.getConnection(url, user, pass);
			String sql = "insert into healthemp (name, phonenum, gender, division, birth, money, card, total) values (?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, healthDo.getName());
			pstmt.setString(2, healthDo.getPhoneNum());
			pstmt.setString(3, healthDo.getGender());
			pstmt.setString(4, healthDo.getDivision());
			pstmt.setString(5, healthDo.getBirth());
			pstmt.setString(6, healthDo.getMoney());
			pstmt.setString(7, healthDo.getCard());
			pstmt.setString(8, healthDo.getTotal());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
	}// end of insertHealthEmp
		// 계산기능

	// 삭제
	public void delHelthEmp(HealthDO health) {
		try {
			conn = DriverManager.getConnection(url, user, pass);
			pstmt = conn.prepareStatement(//
					"delete FROM HealthEmp where name =?"//
			);
			pstmt.setString(1, health.getName());

			int r = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// end of delHelthEmp()

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}// end of Class