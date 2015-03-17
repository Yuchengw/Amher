package com.iamhere.main_platform;

import java.util.Date;

import org.joda.time.DateTime;

import com.iamhere.entities.PostObject;
import com.iamhere.entities.RecurEventInfo;
import com.iamhere.entities.UserObject;
import com.iamhere.trashbin.ProvidePost;
import com.iamhere.trashbin.RequestPost;

public class PostBuilderDirector {
	private static final PostBuilderDirector INSTANCE = new PostBuilderDirector();
	 
    private PostBuilderDirector() {}
 
    // simple, thread safe and lazy load: initialization-on-demand holder idiom
    private static class PostBuilderDirectorHolder {
    	public static final PostBuilderDirector holder = new PostBuilderDirector();
    }
    
    public static PostBuilderDirector getInstance() {
        return PostBuilderDirectorHolder.holder;
    }
    
    //TODO: remove this in th future
//	public RequestPost constructRequestPost(String subject, String location, int quantity, Period period, double cost, UserObject creator) {
//		RequestPostBuilder postBuilder = RequestPostBuilder.getInstance();
//		postBuilder.createNewAbstractPost(subject, location, quantity);
//		postBuilder.buildCreator(creator);
//		postBuilder.buildPeriod(period);
//		postBuilder.buildCost(cost);
//		return (RequestPost) postBuilder.getPost();
//	}
//	
//	public ProvidePost constructProvidePost(String subject, String location, int quantity, Period period, double cost, UserObject creator, Date expiration) {
//		ProvidePostBuilder postBuilder = ProvidePostBuilder.getInstance();
//		postBuilder.createNewAbstractPost(subject, location, quantity);
//		postBuilder.buildCreator(creator);
//		postBuilder.buildPeriod(period);
//		postBuilder.buildCost(cost);
//		postBuilder.buildExpiration(expiration);
//		return (ProvidePost) postBuilder.getPost();
//	}
	
	public PostObject constructPost( String subject, String location, int quantity, RecurEventInfo period, double cost, UserObject creator, DateTime expiration) {
		PostBuilder postBuilder = new PostBuilder();
		postBuilder.createNewPost(creator, subject, location, quantity);
		postBuilder.buildPeriod(period);
		postBuilder.buildCost(cost);
		postBuilder.buildExpiration(expiration);
		return postBuilder.getPost();
	}
}
