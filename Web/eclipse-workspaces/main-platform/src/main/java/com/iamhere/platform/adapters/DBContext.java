package com.iamhere.platform.adapters;

public class DBContext {
	public static DatabaseProvider getContext() {
		return new  MongoDbProvider();
	}
}
