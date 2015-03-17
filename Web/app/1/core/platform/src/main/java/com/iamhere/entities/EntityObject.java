package com.iamhere.entities;

import java.util.Collections;
import java.util.List;

import org.joda.time.DateTime;

import com.iamhere.enums.DMLEvents;
import com.iamhere.mongodb.entities.DBEntityObject;
import com.iamhere.platform.func.BulkEntityOperations;
import com.iamhere.platform.func.DmlOperationWrapper;
import com.iamhere.platform.func.DmlValidationHandler;

/**
 * Represent a single entity row for data manipulation. This object contains an
 * array of fields with the purpose of holding data values for that row. The
 * class is responsible for persisting and reading those value.
 * 
 * @author platform
 *
 */
public abstract class EntityObject {
	private String id;
	private DateTime createdDate;
	private DateTime lastModifiedDate;
	
	public EntityObject() {
	}

	public abstract void saveHook_Validate(DmlValidationHandler dml);

	
	public abstract DBEntityObject getDbObject() ;
	public abstract  void reloadAllFieldInformationFromDb();
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public DateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
		getDbObject().setCreatedDate(createdDate.toDate());
	}

	public DateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
		getDbObject().setLastModifiedDate(lastModifiedDate.toDate());
	}
	
	public abstract boolean isNew();
	
	public final DmlOperationWrapper save()  {
		DMLEvents dmlType = DMLEvents.SAVE;
		if (isNew()) {
			dmlType = DMLEvents.CREATE;
		} 
		return BulkEntityOperations.bulkSave(Collections.singletonList(this),
				dmlType);
	}

	public EntityObject load() throws Exception {
		 List<EntityObject> reloads = BulkEntityOperations.bulkLoad(Collections.singletonList(this));
		 if (reloads != null && reloads.size() >  0) {
			 return reloads.get(0);
		 } else {
			 return null;
		 }
	}
	
	public boolean remove() {
		 return BulkEntityOperations.bulkRemove(Collections.singletonList(this));
	}
}
