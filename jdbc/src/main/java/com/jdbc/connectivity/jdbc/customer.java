package com.jdbc.connectivity.jdbc;

public class customer {
int cid;
String name;
int amount;
String city;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public customer(int cid, String name, int amount, String city) {
	super();
	this.cid = cid;
	this.name = name;
	this.amount = amount;
	this.city = city;
}
public customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "customer [cid=" + cid + ", name=" + name + ", amount=" + amount + ", city=" + city + "]";
}

}
