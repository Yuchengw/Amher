package com.iamhere.main_platform;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.iamhere.entities.UserObject;
import com.iamhere.platform.func.DmlOperationWrapper;

public class UserManagerTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public UserManagerTest( String testName ) {
	    super( testName );
	}
	
	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
	    return new TestSuite( PostObjectTest.class );
	}
	
	/**
	 * Create a new user and save to db
	 * @throws Exception 
	 */
	public void testCreateNewUser() {
		UserObject user = new UserObject("Jassica", "admin", "jassica_jiafei@163.com", "test1234");
		user.setActiveScore(10000);
		user.setAlias("jadmin");
		user.setCreditInfo(10000);
		user.setRole("admin");
		DmlOperationWrapper dmlOperationState = user.save();
		assertTrue("Save should succeed", dmlOperationState.isBulkSuccess());
		assertNotNull("User should be saved successfully", user.getId());
		System.out.println("Newly created user id is: " + user.getId());
	}
	
}
