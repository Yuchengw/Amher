package com.iamhere.main_platform;

import com.iamhere.trashbin.RequestPost;

public class RequestPostBuilder { //extends PostBuilder {

	 private static volatile RequestPostBuilder INSTANCE = null;
	 
	    private RequestPostBuilder() {}
	 
	    //thread safe and performance  promote 
	    public static  RequestPostBuilder getInstance() {
	        if(INSTANCE == null){
	             synchronized(RequestPostBuilder.class){
	                 //when more than two threads run into the first null check same time, to avoid instanced more than one time, it needs to be checked again.
	                 if(INSTANCE == null){ 
	                     INSTANCE = new RequestPostBuilder();
	                  }
	              } 
	        }
	        return INSTANCE;
	    }
	    
//	@Override
//	public void createNewAbstractPost(String subject, String location, int quantity) {
//		post = new RequestPost(subject, location, quantity);
//	}
}
