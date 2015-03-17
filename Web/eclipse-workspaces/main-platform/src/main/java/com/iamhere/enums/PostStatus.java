package com.iamhere.enums;

public enum PostStatus {
	OPEN("Open", "o"), CLOSE("Close", "c"), EXPIRE("Expire", "e"), REMOVED(
			"Removed", "r");

	private String apiValue;
	private String dbValue;

	private PostStatus(String apiValue, String dbValue) {
		this.apiValue = apiValue;
		this.dbValue = dbValue;
	}

	public String getDbValue() {
		return this.dbValue;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Post Status");
		sb.append("{apiValue = ").append(apiValue);
		sb.append(", dbValue = ").append(dbValue);
		sb.append("}");
		return sb.toString();
	}

	public static PostStatus fromDbValue(String dbValue) {
		switch (dbValue) {
		case "o":
			return OPEN;
		case "c":
			return CLOSE;
		case "e":
			return EXPIRE;
		case "r":
			return REMOVED;
		}
		return null;
	}
}
