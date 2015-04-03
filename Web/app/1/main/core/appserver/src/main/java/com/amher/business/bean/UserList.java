package com.amher.business.bean;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * This class could be used generically, partner list
 * 
 * */

public class UserList extends BeanObject {
	
	private static final long serialVersionUID = -1370183045720704453L;

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
	
	@JsonSerialize
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
