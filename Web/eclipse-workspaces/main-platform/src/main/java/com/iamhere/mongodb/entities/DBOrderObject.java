package com.iamhere.mongodb.entities;

import java.util.Date;

import org.bson.types.ObjectId;
import org.joda.time.DateTime;

import com.iamhere.entities.PostObject;
import com.iamhere.entities.UserObject;
import com.iamhere.platform.func.DmlValidationHandler;

public class DBOrderObject extends DBEntityObject {
	private ObjectId jiaFang;
	private ObjectId yiFang;
	private boolean isSuccess;
	private Date TransactionDateTime;
	private ObjectId parentPost;
	// TODO: should this restricted to ProvidePost
	private String thirdPartyInfo;
	private double actualCost; // TODO: both jia and yi can modify it
	private int quantity; // TODO: only yi can modify it
	private double score;	// TODO: only yi can modify it
	
	public DBOrderObject()  {
	}

	public ObjectId getJiaFang() {
		return jiaFang;
	}

	public void setJiaFang(ObjectId jiaFang) {
		this.jiaFang = jiaFang;
	}

	public ObjectId getYiFang() {
		return yiFang;
	}

	public void setYiFang(ObjectId yiFang) {
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

	public ObjectId getParentPost() {
		return parentPost;
	}

	public void setParentPost(ObjectId parentPost) {
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
	public String getDbTableName() {
		// TODO Auto-generated method stub
		return null;
	}

}
