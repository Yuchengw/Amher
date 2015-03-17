package com.iamhere.trashbin;

import java.util.Date;
import java.util.Map;

public class ProvidePost  {

	private Date expireDate;

//	public ProvidePost(String subject, String location, int quantity) {
//		super(subject, location, quantity);
//		// by default, set the cost to be zero for donation
//		setCost(0);
//		setType(AbstractPost.PROVIDE);
//	}
//
//	public ProvidePost(String subject, String location, int quantity,
//			double cost) {
//		super(subject, location, quantity);
//		setCost(cost);
//	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	
//	@Override
//	public Map<String, java.io.Serializable> getFieldsAndValues() {
//		Map<String, java.io.Serializable> maps = super.getFieldsAndValues();
//		maps.put("expireDate", getExpireDate());
//		return maps;
//	}
}
