package com.iamhere.main_platform;

import java.util.Date;

import com.iamhere.trashbin.ProvidePost;

public class ProvidePostBuilder  {//extends PostBuilder{
	
	private static volatile ProvidePostBuilder INSTANCE = null;
	 
    private ProvidePostBuilder() {}
 
    //thread safe and performance  promote 
    public static  ProvidePostBuilder getInstance() {
        if(INSTANCE == null){
             synchronized(ProvidePostBuilder.class){
                 //when more than two threads run into the first null check same time, to avoid instanced more than one time, it needs to be checked again.
                 if(INSTANCE == null){ 
                     INSTANCE = new ProvidePostBuilder();
                  }
              } 
        }
        return INSTANCE;
    }
    
//	@Override
//	public void createNewAbstractPost(String subject, String location, int quantity) {
//		post = new ProvidePost(subject, location, quantity);
//	}
//	
//	public void buildExpiration(Date expireDate) {
//		((ProvidePost)post).setExpireDate(expireDate);
//	}
}
