package com.iamhere.mongodb.entities;

import java.util.Map;

import com.iamhere.platform.func.DmlValidationHandler;

public class DBUserObject extends DBEntityObject {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private double creditInfo; // the number of likes fro all the posts
	private double activeScore; // the sum of provide posts, request posts and
								// post comments
	private String password;
	private String alias;
	private String role;
	
	public DBUserObject() {
	}

	public DBUserObject(String id) {
		set_id(id);
	}

	// Getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getCreditInfo() {
		return creditInfo;
	}

	public void setCreditInfo(double creditInfo) {
		this.creditInfo = creditInfo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getActiveScore() {
		return activeScore;
	}

	public void setActiveScore(double activeScore) {
		this.activeScore = activeScore;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public Map<String, Object> getFieldsAndValues() {
		Map<String, Object> maps = super.getFieldsAndValues();
//		maps.put("createdDate", getCreatedDate());
//		maps.put("lastModifiedDate", getLastModifiedDate());
//		maps.put("firstName", getFirstName());
//		maps.put("lastName", getLastName());
//		maps.put("email", getEmail());
//		maps.put("phone", getPhone());
//		maps.put("creditInfo", getCreditInfo());
//		maps.put("activeScore", getActiveScore());
//		maps.put("password", getPassword());
//		maps.put("alias", getAlias());
//		maps.put("role", getRole());
		return maps;
	}
	
	@Override
	public void saveHook_Validate(DmlValidationHandler dml) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDbTableName() {
		return "Users";
	}

}
