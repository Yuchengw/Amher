package com.iamhere.platform.func;

import java.util.ArrayList;
import java.util.List;

import com.iamhere.entities.EntityObject;
import com.iamhere.enums.DMLEvents;

public class DmlValidationHandler {
	private List<String> errorMessages;
	private final EntityObject entityObject;
	private final DMLEvents dmlType;
	public DmlValidationHandler(EntityObject o, DMLEvents dmlType) {
		this.entityObject = o;
		this.errorMessages = new ArrayList<String>();
		this.dmlType = dmlType;
	}
	
	public void validate() {
		entityObject.saveHook_Validate(this);
	}
	
	public void addError(String s) {
		this.errorMessages.add(s);
	}
	
	public boolean isCurrenctlyValid() {
		return this.errorMessages.isEmpty();
	}

	public DMLEvents getDmlType() {
		return dmlType;
	}
	
}
