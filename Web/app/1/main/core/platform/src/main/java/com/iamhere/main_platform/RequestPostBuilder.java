package com.iamhere.main_platform;

import com.iamhere.trashbin.RequestPost;

public class RequestPostBuilder { //extends PostBuilder {

	 private static volatile RequestPostBuilder INSTANCE = null;
	 
	    private RequestPostBuilder() {}
	    
	    private static class RequestPostBuilderHolder {
	    	private static final RequestPostBuilder holder = new RequestPostBuilder();
	    }
	 
	    //thread safe and performance  promote 
	    public static  RequestPostBuilder getInstance() {
	        return RequestPostBuilderHolder.holder;
	    }
	    
//	@Override
//	public void createNewAbstractPost(String subject, String location, int quantity) {
//		post = new RequestPost(subject, location, quantity);
//	}
}
