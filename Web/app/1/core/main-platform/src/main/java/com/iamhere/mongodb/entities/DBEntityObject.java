package com.iamhere.mongodb.entities;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.iamhere.platform.func.DmlValidationHandler;
import com.mongodb.ReflectionDBObject;

public abstract class DBEntityObject extends ReflectionDBObject {
	private Date createdDate;
	private Date lastModifiedDate;
	
	public DBEntityObject() {
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
	public abstract void saveHook_Validate(DmlValidationHandler dml);

	public abstract String getDbTableName();

	public Map<String, Object> getFieldsAndValues() {
		Map<String, Object> maps = new HashMap<String, Object>();
		maps.put("_id", get_id());
		return maps;
	}
}