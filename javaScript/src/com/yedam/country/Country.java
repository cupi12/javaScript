package com.yedam.country;

public class Country {
String countryid, countryname;
int regionid;
public String getCountryid() {
	return countryid;
}
public void setCountryid(String countryid) {
	this.countryid = countryid;
}
public String getCountryname() {
	return countryname;
}
public void setCountryname(String countryname) {
	this.countryname = countryname;
}
public int getRegionid() {
	return regionid;
}
public void setRegionid(int regionid) {
	this.regionid = regionid;
}
@Override
public String toString() {
	return "Country [countryid=" + countryid + ", countryname=" + countryname + ", regionid=" + regionid + "]";
}
public Country(String countryid, String countryname, int regionid) {
	super();
	this.countryid = countryid;
	this.countryname = countryname;
	this.regionid = regionid;
}




}
