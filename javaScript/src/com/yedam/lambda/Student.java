package com.yedam.lambda;

public class Student {
	private String name;
	String sex;
	private int mathScore;
	private int englishScore;

	public Student(String name, String sex, int mathScore, int englishScore) {
		super();
		this.name = name;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void getSex(String sex) {
		this.sex = sex;
	}

	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}
}
