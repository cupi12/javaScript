package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HealthModel {
	// 회원정보
	String name; // 회원명
	String phoneNum; // 핸드폰번호
	String gender; // 성별
	String division; // 구분
	String birth; // 생년월일

	// 등급정보
	String grade; // 회원등급
	String date; // 사용개월

	// 결제정보
	int membership; // 회원권
	int box;// 사물함
	int cloth;// 운동복
	int mMoney;// 미납금액
	int sum;// 받을금액

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMembership() {
		return membership;
	}

	public void setMembership(int membership) {
		this.membership = membership;
	}

	public int getBox() {
		return box;
	}

	public void setBox(int box) {
		this.box = box;
	}

	public int getCloth() {
		return cloth;
	}

	public void setCloth(int cloth) {
		this.cloth = cloth;
	}

	public int getmMoney() {
		return mMoney;
	}

	public void setmMoney(int mMoney) {
		this.mMoney = mMoney;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	Connection conn = null;

	public HealthModel() {
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
	}// end of HealthModel()

	// 조회기능
	PreparedStatement pstmt;

	public List<HealthModel> getHealthEmpList() {
		List<HealthModel> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(//
					"SELECT * FROM HealthEmp where name =?"//
			);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				HealthModel h = new HealthModel();
				h.setName(rs.getString("name"));
				h.setPhoneNum(rs.getString("phonenum"));
				h.setGender(rs.getString("gender"));
				h.setDivision(rs.getString("division"));
				h.setBirth(rs.getString("birth"));
				list.add(h);
			} // end of while
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}// end of getHealthEmp()

	// 등록기능
	public void insertHealthEmp(HealthModel h) {
		try {
			pstmt = conn.prepareStatement("insert into HealthEmp values ?,?,?,?,?");
			pstmt.setString(1, getName());
			pstmt.setString(2, getPhoneNum());
			pstmt.setString(3, getGender());
			pstmt.setString(4, getDivision());
			pstmt.setString(5, getBirth());
			System.out.println("회원 추가 완료!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// end of insertHealthEmp
		// 계산기능

	// 삭제
	public void delHelthEmp(String emp) {
		try {
			pstmt = conn.prepareStatement(//
					"delete FROM HealthEmp where name =?"//
			);
			pstmt.setString(1, emp);

			int r = pstmt.executeUpdate();
			System.out.println(emp + " 회원이 삭제되었습니다. " + r + "건 삭제 완료!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// end of delHelthEmp()

}// end of Class
