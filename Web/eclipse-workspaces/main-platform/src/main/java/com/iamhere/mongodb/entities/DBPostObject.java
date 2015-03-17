package com.iamhere.mongodb.entities;

import java.util.Date;
import java.util.Map;

import org.bson.types.ObjectId;

import com.iamhere.entities.RecurEventInfo;
import com.iamhere.entities.UserObject;
import com.iamhere.platform.func.DmlValidationHandler;

public class DBPostObject extends DBEntityObject {
	// private fields
	private String subject;
	private String location;
	private RecurEventInfo period;
	private int quantity;
	private String commentsOrDescription;
	private double cost;
	private String image;
	private ObjectId[] partners;
	private String postCategory;
	private String status;
	private int numberOfOrders; // TODO: more detail
	private int numberOfLikes;
	private ObjectId creator;
	private ObjectId lastModifiedBy;
	private String type;
	private Date expireDate;

	public DBPostObject(ObjectId creator, String subject, String location,
			int quantity) {
		this.creator = creator;
		this.subject = subject;
		this.location = location;
		this.quantity = quantity;
		this.postCategory = "Food";
	}

	public DBPostObject(String id) {
		set_id(id);
	}

	public DBPostObject() {
	}

	public String getType() {
		return type;
	}

	/* Getters and Setters */
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public RecurEventInfo getPeriod() {
		return period;
	}

	public void setPeriod(RecurEventInfo period) {
		this.period = period;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCommentsOrDescription() {
		return commentsOrDescription;
	}

	public void setCommentsOrDescription(String commentsOrDescription) {
		this.commentsOrDescription = commentsOrDescription;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		assert (cost >= 0);
		this.cost = cost;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public ObjectId[] getPartners() {
		return partners;
	}

	public void setPartners(ObjectId[] partners) {
		this.partners = partners;
	}

	public void setPartners(UserObject[] partners) {
		if (partners != null) {
			ObjectId[] partnerIds = new ObjectId[partners.length];
			for (int i = 0; i < partnerIds.length; i++) {
				partnerIds[i] = new ObjectId(partners[i].getId());
			}
			this.partners = partnerIds;
		}
	}

	public String getPostCategory() {
		return postCategory;
	}

	public void setPostCategory(String postCategory) {
		this.postCategory = postCategory;
	}

	public String getStatus() {
		return this.status;// PostStatus.fromDbValue(this.status);
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNumberOfOrders() {
		return numberOfOrders;
	}

	public void setNumberOfOrders(int numberOfOrders) {
		this.numberOfOrders = numberOfOrders;
	}

	public int getNumberOfLikes() {
		return numberOfLikes;
	}

	public void setNumberOfLikes(int numberOfLikes) {
		this.numberOfLikes = numberOfLikes;
	}

	public ObjectId getCreator() {
		return creator;
	}

	public void setCreator(ObjectId creator) {
		this.creator = creator;
	}

	public void setCreatorWithEntity(UserObject creator) {
		if (creator == null)
			this.creator = null;
		else
			this.creator = new ObjectId(creator.getId());
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public ObjectId getLastModifiedBy() {
		return lastModifiedBy;
	}
	
	public void setLastModifiedBy(ObjectId lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public void setLastModifiedByWithEntity(UserObject lastModifiedBy) {
		if (lastModifiedBy == null) {
			this.lastModifiedBy = null;
		} else {
			this.lastModifiedBy = new ObjectId(lastModifiedBy.getId());
		}
	}


	public Map<String, Object> getFieldsAndValues() {
		Map<String, Object> maps = super.getFieldsAndValues();
		// maps.put("createdDate", getCreatedDate());
		// maps.put("lastModifiedDate", getLastModifiedDate());
		// maps.put("subject", getSubject());
		// maps.put("location", getLocation());
		// // maps.put("period", getPeriod());
		// maps.put("quantity", getQuantity());
		// maps.put("description", getCommentsOrDescription());
		// maps.put("cost", getCost());
		// maps.put("image", getImage());
		// maps.put("partners", getPartners());
		// maps.put("type", getType());
		// maps.put("category", getPostCategory());
		// maps.put("status", getStatus());
		// maps.put("expireDate", getExpireDate());
		// // maps.put("creator", getCreator());
		return maps;
	}

	@Override
	public void saveHook_Validate(DmlValidationHandler dml) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getDbTableName() {
		return "Posts";
	}
}
