package POS;

public class Item {

	public static final int TYPE_INVALID = -1;
	public static final int TYPE_SHIRT = 1;
	public static final int TYPE_PANTS = 2;
	
	private int type;
	
	public Item () 	{
		
	}
	
	public Item (int givenType) 	{
		
		type = givenType;
	}
	
}
