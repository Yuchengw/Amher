package com.iamhere.enums;

public enum DMLEvents {
	CREATE, UPDATE, SAVE,  REMOVE;
	
	public String getValue() {
		switch (this) {
		case CREATE:
			return "create";
		case UPDATE:
			return "update";
		case REMOVE:
			return "remove";
		case SAVE:
			return "save";
		} 
		throw new AssertionError();
	}
}
