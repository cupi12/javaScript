package com.yedam.country;

import java.util.ArrayList;
import java.util.List;

public class CountryImpl implements CountryService {

		
	CountryDAO dao = new CountryDAO();
	@Override
	public List<Country> getCountryList() {
		return dao.getCountryList();
	}
	
	
}
