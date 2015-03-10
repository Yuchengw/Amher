package com.iamhere.main_platform;

import java.util.Date;

import org.joda.time.DateTime;

import com.iamhere.entities.PostObject;
import com.iamhere.entities.RecurEventInfo;
import com.iamhere.entities.UserObject;
import com.iamhere.enums.PostStatus;

public  class PostBuilder {
	protected PostObject post;

	public PostObject getPost() {
		return post;
	}

	public  void createNewPost(UserObject creator, String subject, String location,
			int quantity){
		post = new PostObject(creator, subject, location, quantity);
	}

	public void buildSubject(String subject) {
		post.setSubject(subject);
	}

	public void buildLocation(String location) {
		post.setLocation(location);
	}

	public void buildQuantity(int quantity) {
		post.setQuantity(quantity);
	}

	public void buildCost(double cost) {
		post.setCost(cost);
	}

	public void buildPeriod(RecurEventInfo period) {
		post.setPeriod(period);
	}

	public void buildCommentAndDescription(String comment) {
		post.setCommentsOrDescription(comment);
	}

	public void buildImage(String webURL) {
		post.setImage(webURL);
	}

	public void buildPartner(UserObject[] users) {
		post.setPartners(users);
	}

	public void buildStatus(PostStatus status) {
		post.setStatus(status);
	}

	public void buildCreator(UserObject creator) {
		post.setCreator(creator);
	}
	
	public void buildExpiration(DateTime expireDate) {
		post.setExpireDate(expireDate);
	}
}
