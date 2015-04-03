package com.amher.business.bean;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class PostCommentList extends BeanObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7165192163461913556L;
	
	private int count;
	private List<User> users;

	public PostCommentList() {
	}

	public PostCommentList(List<User> users) {
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
