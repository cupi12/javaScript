package com.yedam.country;

import java.util.List;

public class Main {
public static void main(String[] args) {
	CountryDAO d = new CountryDAO();
	List<Country> list = d.getCountryList();
	for(Country c : list) {
		System.out.println(c);
	}
}
}
