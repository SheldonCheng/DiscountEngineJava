package POS;
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
	
	public void Remove (Product item) {
        CatalogList.remove(item);
	}

	public int getQuantity () {
		return CatalogList.size();
	}
}
