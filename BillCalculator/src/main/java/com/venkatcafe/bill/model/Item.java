package com.venkatcafe.bill.model;

public class Item {
	private String name;
	private ItemTypeEnum itemType;
	private Double price;
	
	public Item(String name, ItemTypeEnum itemType, Double price) {
		this.name = name;
		this.itemType = itemType;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ItemTypeEnum getItemType() {
		return itemType;
	}
	
	public void setItemType(ItemTypeEnum itemType) {
		this.itemType = itemType;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
}