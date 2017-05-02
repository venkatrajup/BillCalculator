package com.venkatcafe.bill.model;

public enum ItemTypeEnum {
	COLD_DRINK(0),
	HOT_DRINK(0),
	COLD_FOOD(10),
	HOT_FOOD(20);

	private int percentage; 
	
	private ItemTypeEnum(int percentage) { 
		this.percentage = percentage; 
	}

	public int getPercentage() {
		return percentage;
	}
}