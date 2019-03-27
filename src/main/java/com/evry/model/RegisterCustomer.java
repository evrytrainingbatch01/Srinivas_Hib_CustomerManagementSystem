package com.evry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class RegisterCustomer {
private int id;
private String username;
private String password;
private String age;
private String email;
private String Address;
private String mobileno;
private int active;

@Id
@Column(name="id")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(name="username")
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Column(name="password")
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Column(name="age")
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
@Column(name="email")
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Column(name="address")
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getMobileno() {
	return mobileno;
}
@Column(name="mobileno")
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
@Column(name="active")
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}
}
