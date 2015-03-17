package com.iamhere.trashbin;

public class TimeInterval {
	public enum TimeUnit {
		//TODO:
		MINUTES(1), HOURS(60), DAYS(60*24), MONTHS(0), YEARS(0);
		private int offset;
		private TimeUnit(int offset) {
			this.offset = offset;
		}
		public int getOffset() {
			return offset;
		}
	}
	
	private TimeUnit unit;
	private int offset;
	
	public TimeInterval(TimeUnit unit, int offset) {
		this.setUnit(unit);
		this.setOffset(offset);
	}

	public TimeUnit getUnit() {
		return unit;
	}

	public void setUnit(TimeUnit unit) {
		this.unit = unit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
}
