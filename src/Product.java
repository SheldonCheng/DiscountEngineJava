
public class Product {
	
	public float fPrice;
	public String sItemCode;
	
	public Product (float price, String itemCode)
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

	public String GetitemCode () {
		return sItemCode;
	}
}
