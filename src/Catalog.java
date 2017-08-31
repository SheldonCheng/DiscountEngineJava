import java.util.ArrayList;
import java.util.List;

public class Catalog {

	private ArrayList<Product> CatalogList = new ArrayList<Product>();
	
	public Catalog (){
		
		// Hard Code Items
		Add(new Product(1,"alpha"));
		Add(new Product(2,"beta"));
		Add(new Product(3,"charlie"));
		Add(new Product(4,"delta"));
		Add(new Product(5,"echo"));
				
	}

	public void Add (Product newItem) {
		CatalogList.add(newItem);
	}
	
	public void Remove (String itemCode) {

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
