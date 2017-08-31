package POS;

import java.util.Collection;
import java.util.HashMap;

public class ShoppingCart {
	
	private HashMap<Integer, Integer> itemsByType = new HashMap<Integer, Integer>();

	/*public int getDiscountItemCount() {

		int discountedItemCount = 0;
		
		Collection<Integer> values = itemsByType.values();
		
		for(Integer value : values)
		{
			discountedItemCount += (value/2);
		}
		
		return discountedItemCount;
	}
	*/
	
	public int getItemCount() {

		int ItemCount = 0;
		
		Collection<Integer> values = itemsByType.values();
		
		for(Integer value : values)
		{
			ItemCount += value;
		}
		
		return ItemCount;
	}
	
	public void addItem (int givenType) 	{
		
		if(!itemsByType.containsKey(givenType))
		{
			itemsByType.put(givenType, 1);
		}
		else
		{
			itemsByType.put(givenType, itemsByType.get(givenType)+1);
		}
		
	}

}
