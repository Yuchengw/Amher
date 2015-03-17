package com.iamhere.trashbin;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.iamhere.entities.PostObject;
import com.iamhere.entities.UserObject;
import com.iamhere.enums.DMLEvents;
import com.iamhere.platform.adapters.DatabaseProvider;

public class PostManager {
	final String TABLE_NAME = "Posts";
	private DatabaseProvider dbProvider;
	
	public PostManager(DatabaseProvider dbProvider) {
		this.dbProvider = dbProvider;
	}
	
//	public PostObject[] getAllPosts() {
//		Object[] objectArray = dbProvider.getAllTableRecords("Posts", PostObject.class);
//		PostObject[] posts = new PostObject[objectArray.length]; 
//		for (int i = 0; i<objectArray.length; i++) {
//			posts[i] =  (PostObject) objectArray[i];
//			//new UserObject(objectArray[i]);
//		}
//		return posts;
//	}
//	
//	public void savePosts(PostObject[] posts, UserObject user, DMLEvents event) throws Exception{
//		dbProvider.saveRecords(TABLE_NAME, posts);
//	}
//	
//	public void createNewPost(PostObject[] posts, UserObject user) throws Exception {
//		dbProvider.insertRecords(TABLE_NAME, posts);
//	}
//	
//	public void removePosts(PostObject[] posts) throws Exception {
//		dbProvider.removeRecords(TABLE_NAME, posts);
//	}
//	
//	public PostObject getPostById(String id)  {
//		Map<String, Serializable> query = new HashMap<String, Serializable>();
//		query.put("id", id);
//		Object[] objectArray = dbProvider.getRecordsBasedOnQuery(TABLE_NAME, PostObject.class, query);
//		assert(objectArray != null);
//		if (objectArray.length != 1) {
//			return null;
//		}
//		return (PostObject) objectArray[0];
//	}
//	
//	
	
}
