package project.model;

public class HealthDO {
	// 회원정보
	String name; // 회원명
	String phoneNum; // 핸드폰번호
	String gender; // 성별
	String division; // 구분
	String birth; // 생년월일
	String money;// 현금
	String card;// 카드
	String total;// 결제금액

	// 등급정보
	String grade; // 회원등급
	String month; // 사용개월

	
	
	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

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

	@Override
	public String toString() {
		return "HealthDO [name=" + name + ", phoneNum=" + phoneNum + ", gender=" + gender + ", division=" + division
				+ ", birth=" + birth + ", grade=" + grade + ", month=" + month + ", membership=" + membership + ", box="
				+ box + ", cloth=" + cloth + ", mMoney=" + mMoney + ", sum=" + sum + "]";
	}

}
