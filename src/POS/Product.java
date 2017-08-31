package POS;

public class Product {
	
	public float fPrice;
	public int sItemCode;
	
	public Product (float price, int itemCode)
	{
		fPrice = price;
		sItemCode = itemCode;
	}
	
	public void SetPrice (float price) {
		fPrice = price;
	}
	
	public float GetPrice () {
		return fPrice;
	}

	public int GetitemCode () {
		return sItemCode;
	}
}
