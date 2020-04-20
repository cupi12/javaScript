package project.model;

import javafx.beans.property.SimpleStringProperty;

public class ObserverHealthDO {

	public SimpleStringProperty name = new SimpleStringProperty();
	public SimpleStringProperty phoneNum = new SimpleStringProperty();
	public SimpleStringProperty gender = new SimpleStringProperty();
	public SimpleStringProperty division = new SimpleStringProperty();
	public SimpleStringProperty birth = new SimpleStringProperty();
	public SimpleStringProperty money = new SimpleStringProperty();
	public SimpleStringProperty card = new SimpleStringProperty();
	public SimpleStringProperty total = new SimpleStringProperty();
	public SimpleStringProperty getName() {
		return name;
	}
	public void setName(String name) {
		this.name.set(name);
	}
	public String getPhoneNum() {
		return phoneNum.get();
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum.set(phoneNum);;
	}
	public String getGender() {
		return gender.get();
	}
	public void setGender(String gender) {
		this.gender.set(gender);;
	}
	public String getDivision() {
		return division.get();
	}
	public void setDivision(String division) {
		this.division.set(division);;
	}
	public String getBirth() {
		return birth.get();
	}
	public void setBirth(String birth) {
		this.birth.set(birth);;
	}
	public String getMoney() {
		return money.get();
	}
	public void setMoney(String money) {
		this.money.set(money);;
	}
	public String getCard() {
		return card.get();
	}
	public void setCard(SimpleStringProperty card) {
		this.card = card;
	}
	public String getTotal() {
		return total.get();
	}
	public void setTotal(String total) {
		this.total.set(total);;
	}

}
