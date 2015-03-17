package com.iamhere.entities;

import java.util.Date;

import org.joda.time.DateTime;

import com.iamhere.mongodb.entities.DBEntityObject;
import com.iamhere.platform.func.DmlValidationHandler;
import com.iamhere.trashbin.Entity;

// TODO: Add the bargain features
public class OrderObject extends EntityObject {
	
	private UserObject jiaFang;
	private UserObject yiFang;
	private boolean isSuccess;
	private Date TransactionDateTime;
	private PostObject parentPost;
	// TODO: should this restricted to ProvidePost
	private String thirdPartyInfo;
	private double actualCost; // TODO: both jia and yi can modify it
	private int quantity; // TODO: only yi can modify it
	private double score;	// TODO: only yi can modify it
	
	public OrderObject(UserObject jia, UserObject yi)  {
		this.jiaFang = jia;
		this.yiFang = yi;
		setCreatedDate( new DateTime());
	}

	public UserObject getJiaFang() {
		return jiaFang;
	}

	public void setJiaFang(UserObject jiaFang) {
		this.jiaFang = jiaFang;
	}

	public UserObject getYiFang() {
		return yiFang;
	}

	public void setYiFang(UserObject yiFang) {
		this.yiFang = yiFang;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Date getTransactionDateTime() {
		return TransactionDateTime;
	}

	public void setTransactionDateTime(Date transactionDateTime) {
		TransactionDateTime = transactionDateTime;
	}

	public PostObject getParentPost() {
		return parentPost;
	}

	public void setParentPost(PostObject parentPost) {
		this.parentPost = parentPost;
	}

	public String getThirdPartyInfo() {
		return thirdPartyInfo;
	}

	public void setThirdPartyInfo(String thirdPartyInfo) {
		this.thirdPartyInfo = thirdPartyInfo;
	}

	public double getActualCost() {
		return actualCost;
	}

	public void setActualCost(double actualCost) {
		this.actualCost = actualCost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	@Override
	public void saveHook_Validate(DmlValidationHandler dml) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DBEntityObject getDbObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reloadAllFieldInformationFromDb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
