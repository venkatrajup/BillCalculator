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
    	for(Item item : list) {
    		if(ItemTypeEnum.COLD_DRINK.name().equals(item.getItemType().name()) 
    				|| ItemTypeEnum.HOT_DRINK.name().equals(item.getItemType().name())) {
        		total += item.getPrice();
    		}
    	}
    	return total;
	}

}
