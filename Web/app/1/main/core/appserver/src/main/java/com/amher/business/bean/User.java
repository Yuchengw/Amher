package com.amher.business.bean;

import java.io.Serializable;
import java.util.Date;
 
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class User implements Serializable {
	
    private static final long serialVersionUID = -7788619177798333712L;
	
	private long id;
	private String name;
	private String email;
	private Date createdDate;
	private Date lastModifiedDate;
	
	public User() {}
	
	public User(long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@JsonSerialize(using=DateSerializer.class)
    public Date getCreatedDate() {
        return createdDate;
    }
	
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
	
    @JsonSerialize(using=DateSerializer.class)
    public Date getLastModifiedDate() {
    	return lastModifiedDate;
    }
	
    public void setLastModifiedDate(Date modifiedDate) {
    	this.lastModifiedDate = modifiedDate;
    }
}
