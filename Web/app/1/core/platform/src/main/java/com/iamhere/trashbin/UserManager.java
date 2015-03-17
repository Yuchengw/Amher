package com.iamhere.trashbin;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.bson.Document;

import com.iamhere.entities.UserObject;
import com.iamhere.platform.adapters.DatabaseProvider;
import com.mongodb.util.JSON;

public class UserManager {
	final String TABLE_NAME = "Users";
	private DatabaseProvider dbProvider;

	public UserManager(DatabaseProvider dbProvider) {
		this.dbProvider = dbProvider;
	}

//	public UserObject[] getAllUsers() {
//		Object[] objectArray = dbProvider.getAllTableRecords(TABLE_NAME, UserObject.class);
//		UserObject[] users = new UserObject[objectArray.length]; 
//		for (int i = 0; i<objectArray.length; i++) {
//			users[i] =  (UserObject) objectArray[i];
//			//new UserObject(objectArray[i]);
//		}
//		return users;
//	}
//	
//	public UserObject getUserById(String id) {
//		Map<String, Serializable> query = new HashMap<String, Serializable>();
//		query.put("id", id);
//		Object[] objectArray = dbProvider.getRecordsBasedOnQuery(TABLE_NAME, UserObject.class, query);
//		assert(objectArray != null);
//		if (objectArray.length != 1) {
//			return null;
//		}
//		return (UserObject) objectArray[0];
//	}
//
//	public void createNewUsers(UserObject[] users) throws Exception {
//		dbProvider.insertRecords(TABLE_NAME, users);
//	}
//	
//	public void removeUsers(UserObject[] users) throws Exception {
//		dbProvider.removeRecords(TABLE_NAME, users);
//	}
	
}
