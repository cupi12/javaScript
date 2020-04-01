package com.yedam.Department;

public class Department {
int departmentid, managerid, locationid;
String departmentname;
public int getDepartmentid() {
	return departmentid;
}
public void setDepartmentid(int departmentid) {
	this.departmentid = departmentid;
}
public int getManagerid() {
	return managerid;
}
public void setManagerid(int managerid) {
	this.managerid = managerid;
}
public int getLocationid() {
	return locationid;
}
public void setLocationid(int locationid) {
	this.locationid = locationid;
}
public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}
@Override
public String toString() {
	return "Department [departmentid=" + departmentid + ", managerid=" + managerid + ", locationid=" + locationid
			+ ", departmentname=" + departmentname + "]";
}


}
