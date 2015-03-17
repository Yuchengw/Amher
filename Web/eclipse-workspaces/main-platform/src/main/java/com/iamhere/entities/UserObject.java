package com.iamhere.entities;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.bson.types.ObjectId;
import org.joda.time.DateTime;

import com.iamhere.enums.DMLEvents;
import com.iamhere.mongodb.entities.DBEntityObject;
import com.iamhere.mongodb.entities.DBUserObject;
import com.iamhere.platform.func.DmlValidationHandler;

/***
 * 
 * @author jassica
 *
 */
public class UserObject  extends EntityObject {
	// private fields
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private double creditInfo; // the number of likes fro all the posts
	private double activeScore; // the sum of provide posts, request posts and
								// post comments
	private String password;
	private String alias;
	private String role;

	// db object
	DBUserObject dbUser;
	
	public UserObject(String firstName, String lastName, String email,
			String password) {
		dbUser = new DBUserObject();
		// TODO: Assume caller will give no-null-empty values
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setPassword(password);
		this.setRole("normal");
	}
	
	public UserObject(DBUserObject dbUser) {
		this.dbUser = dbUser;
		reloadAllFieldInformationFromDb();
	}

	public UserObject(String id) {
		dbUser = new DBUserObject(id);
		setId(id);
	}

	// Getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		dbUser.setFirstName(firstName);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		dbUser.setLastName(lastName);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		dbUser.setEmail(email);
	}

	public double getCreditInfo() {
		return creditInfo;
	}

	public void setCreditInfo(double creditInfo) {
		this.creditInfo = creditInfo;
		dbUser.setCreditInfo(creditInfo);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		dbUser.setPhone(phone);
	}

	public double getActiveScore() {
		return activeScore;
	}

	public void setActiveScore(double activeScore) {
		this.activeScore = activeScore;
		dbUser.setActiveScore(activeScore);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		dbUser.setPassword(password);
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
		dbUser.setAlias(alias);
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
		dbUser.setRole(role);
	}

	/**
	 * =============== Validation of Fields
	 */
	/*
	 * 
	 */
	@SuppressWarnings("finally")
	public boolean validateEmail() {
		boolean isValid = false;
		try {
			//
			// Create InternetAddress object and validated the supplied
			// address which is this case is an email address.
			InternetAddress internetAddress = new InternetAddress(email);
			internetAddress.validate();
			isValid = true;
		} catch (AddressException e) {
			// TODO: need change it to log
			System.out
					.println(" Email Address Exception for: "
							+ email);
		} finally {
			return isValid;
		}
	}

	/**
	 * Validates the password and get the strength score of it 
	 * Z = characters, S = numbers, T = special characters
	 * @return
	 */
	public double validatePassword() {
		String regexZ = "\\d*";  
        String regexS = "[a-zA-Z]+";  
        String regexT = "\\W+$";  
        String regexZT = "\\D*";  
        String regexST = "[\\d\\W]*";  
        String regexZS = "\\w*";  
        String regexZST = "[\\w\\W]*";  
  
        if (password.matches(regexZ) || password.matches(regexS) || password.matches(regexT)) {  
        	return 1.0;
        }  
        if (password.matches(regexZT) || password.matches(regexST) || password.matches(regexZS) ) {  
            return 3.0;
        }  
        if (password.matches(regexZST)) {  
            return 5.0;
        }  
        return 0;
	}

	/**
	 * Verify if the current user already exists in the db
	 * @return
	 */
	// TODO
	public boolean isAlreadyExist() {
		return false;
	}

	@Override
	public void saveHook_Validate(DmlValidationHandler dml) {
		// Do the object validations
		if (getLastName() == null || getLastName().trim().isEmpty()) {
			dml.addError("The last name cannot be empty!");
		}
		if (getEmail() == null || getEmail().trim().isEmpty()) {
			dml.addError("Email cannot be empty!");
		}
		if (getPassword() == null || getPassword().trim().isEmpty()) {
			dml.addError("Password cannot be empty!");
		}
		// Do the db validations
		getDbObject().saveHook_Validate(dml);
		// TODO: reset the the lastModify information as well
		// 2. maybe move to a better place
		if (dml.getDmlType() == DMLEvents.CREATE) {
			setCreatedDate(new DateTime());
			setLastModifiedDate(getCreatedDate());
		} else {
			setLastModifiedDate(new DateTime());
		}
	}

	@Override
	public DBEntityObject getDbObject() {
		if (getId() != null && !getId().isEmpty()) {
			dbUser.set_id(new ObjectId(getId()));
		}
//		dbUser.setActiveScore(getActiveScore());
//		dbUser.setAlias(getAlias());
//		dbUser.setCreatedDate(getCreatedDate());
//		dbUser.setCreditInfo(getCreditInfo());
//		dbUser.setLastModifiedDate(getLastModifiedDate());
//		dbUser.setPhone(getPhone());
//		dbUser.setRole(getRole());
		return dbUser;
	}
	
	public UserObject load() throws Exception {
		return (UserObject) super.load();
	}
	
	public void reloadAllFieldInformationFromDb() {
		setActiveScore(dbUser.getActiveScore());
		setAlias(dbUser.getAlias());
		setCreatedDate(new DateTime(dbUser.getCreatedDate()));
		setCreditInfo(dbUser.getCreditInfo());
		setEmail(dbUser.getEmail());
		setFirstName(getFirstName());
		setId(dbUser.get_id().toString());
		setLastModifiedDate(new DateTime(dbUser.getLastModifiedDate()));
		setLastName(dbUser.getLastName());
		setPassword(dbUser.getPassword());
		setPhone(dbUser.getPhone());
		setRole(dbUser.getRole());
	}

	@Override
	public boolean isNew() {
		return getId() == null || getId().isEmpty() || getCreatedDate() == null;
	}
}
