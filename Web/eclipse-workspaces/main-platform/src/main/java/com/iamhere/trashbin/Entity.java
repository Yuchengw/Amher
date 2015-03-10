package com.iamhere.trashbin;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;

import com.mongodb.ReflectionDBObject;

public abstract class Entity extends ReflectionDBObject   {
	private DateTime createdDate;
	private DateTime lastModifiedDate;
	private String Id;
	
	public DateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}

	public DateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
	public Map<String, java.io.Serializable> getFieldsAndValues() {
		Map<String, java.io.Serializable> maps = new HashMap<String, java.io.Serializable>();
		maps.put("id", getId());
		maps.put("createdDate", getCreatedDate());
		maps.put("lastModifiedDate", getLastModifiedDate());
		return maps;
	}
}
