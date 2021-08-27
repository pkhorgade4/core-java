package com.jdbc.connectivity.jdbc;

public class Empolyee {
int empid;
String name;
String company;
public Empolyee(int empid, String name, String company) {
	super();
	this.empid = empid;
	this.name = name;
	this.company = company;
}
public Empolyee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Empolyee [empid=" + empid + ", name=" + name + ", company=" + company + "]";
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public int getInt() {
	// TODO Auto-generated method stub
	return 0;
}
public String getString() {
	// TODO Auto-generated method stub
	return null;
}
}
