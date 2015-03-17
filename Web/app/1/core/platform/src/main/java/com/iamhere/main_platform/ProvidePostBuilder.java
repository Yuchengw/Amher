package com.iamhere.main_platform;

import java.util.Date;

import com.iamhere.trashbin.ProvidePost;

public class ProvidePostBuilder  {//extends PostBuilder{
	
	private static volatile ProvidePostBuilder INSTANCE = null;
	 
    private ProvidePostBuilder() {}
    
    // simple, thread safe and lazy load: initialization-on-demand holder idiom
    private static class ProvidePostBuilderHolder {
    	private static final ProvidePostBuilder holder = new ProvidePostBuilder();
    }
 
    public static  ProvidePostBuilder getInstance() {
    	return ProvidePostBuilderHolder.holder;
    }
    
//	@Override TODO: remove these files
//	public void createNewAbstractPost(String subject, String location, int quantity) {
//		post = new ProvidePost(subject, location, quantity);
//	}
//	
//	public void buildExpiration(Date expireDate) {
//		((ProvidePost)post).setExpireDate(expireDate);
//	}
}
