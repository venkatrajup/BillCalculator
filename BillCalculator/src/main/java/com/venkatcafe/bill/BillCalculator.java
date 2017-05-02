package com.venkatcafe.bill;

import java.util.List;

import com.venkatcafe.bill.model.Item;
import com.venkatcafe.bill.model.ItemTypeEnum;

public class BillCalculator {

	public Double calculateBill(List<Item> list) {
    	if(null == list || list.size() == 0) {
    		return null;
    	}
    	Double total = 0.0;
    	int percentage = 0;    	
    	for(Item item : list) {
    		total += item.getPrice();    		
    		if(ItemTypeEnum.COLD_DRINK.name().equals(item.getItemType().name()) 
    				|| ItemTypeEnum.HOT_DRINK.name().equals(item.getItemType().name())) {
    		} else if(ItemTypeEnum.COLD_FOOD.name().equals(item.getItemType().name()) && 
    				percentage < item.getItemType().getPercentage()) {
    			percentage = item.getItemType().getPercentage();
    		} else if(ItemTypeEnum.HOT_FOOD.name().equals(item.getItemType().name()) && 
    				percentage < item.getItemType().getPercentage()) {
    			percentage = item.getItemType().getPercentage();
    		}    		
    	}
    	
    	if(percentage == 0)
    	{
    		return total;
    	} else {
    		return total += total/100 * percentage;		
    	}
	}

}
