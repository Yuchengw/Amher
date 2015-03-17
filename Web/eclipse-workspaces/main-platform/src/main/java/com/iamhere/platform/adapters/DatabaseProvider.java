package com.iamhere.platform.adapters;

import java.util.List;
import java.util.Map;

import com.iamhere.entities.EntityObject;

public interface DatabaseProvider {
	public Object getInstance();

	public List<EntityObject>  getAllTableRecords(String tableName,
			EntityObject info);

	public List<EntityObject>  getRecordsBasedOnQuery(String tableName,
			EntityObject info, Map<String, Object> queryInfo);

	public void insertRecords(String tableName, EntityObject[] records)
			throws Exception;

	public void removeRecords(String tableName, EntityObject[] records)
			throws Exception;

	public void saveRecords(String tableName, EntityObject[] records)
			throws Exception;
}
