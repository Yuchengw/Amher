package com.amher.business.bean;

import java.util.List;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class could be used generically, partner list
 * 
 * */

@XmlRootElement(name="users")
public class UserList {
	
	private int count;
	private List<User> users;
	
	public UserList() {}
	
	public UserList(List<User> users) {
		this.users = users;
		this.count = users.size();
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@XmlElement(name="employee")
	public List<User> getEmployees() {
		return users;
	}
	public void setEmployees(List<User> employees) {
		this.users = employees;
	}
	
}