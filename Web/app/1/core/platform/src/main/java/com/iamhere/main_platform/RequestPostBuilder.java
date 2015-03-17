package com.iamhere.main_platform;

import com.iamhere.trashbin.RequestPost;

public class RequestPostBuilder { //extends PostBuilder {

	 private static volatile RequestPostBuilder INSTANCE = null;
	 
	 private RequestPostBuilder() {}
	 
	 // simple, thread safe and lazy load: initialization-on-demand holder idiom
	 private static class RequestPostBuilderHolder {
		 private static final RequestPostBuilder holder = new RequestPostBuilder();
	 }
	 
	 public static  RequestPostBuilder getInstance() {
		 return RequestPostBuilderHolder.holder;
	 }
	    
//	@Override
//	public void createNewAbstractPost(String subject, String location, int quantity) {
//		post = new RequestPost(subject, location, quantity);
//	}
}
