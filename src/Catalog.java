import java.util.ArrayList;
import java.util.List;

import POS.Product;

public class Catalog {

	private ArrayList<Product> CatalogList = new ArrayList<Product>();
	
	public Catalog (){
		
		// Hard Code Items
		Add(new Product(1,1));
		Add(new Product(2,2));
		Add(new Product(3,3));
		Add(new Product(4,4));
		Add(new Product(5,5));
				
	}

	public void Add (Product newItem) {
		CatalogList.add(newItem);
	}
	
	public void Remove (int itemCode) {

		Product p = null;
		
		for (int i = 0 ; i< CatalogList.size(); i++)
		{
			p = CatalogList.get(i);
			if (p.sItemCode == itemCode) {
				CatalogList.remove(i);
			}
		}
	
	}

	public int getQuantity () {
		return CatalogList.size();
	}
}
