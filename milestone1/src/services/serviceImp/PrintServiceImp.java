package services.serviceImp;

import java.util.ArrayList;
import Entity.Product;
import services.PrintService;


public class PrintServiceImp implements PrintService{

	
	public void display(ArrayList<Product> prodlist)
	{
		for(Product p:prodlist) {
			System.out.println("name is -"+p.getName()+" id is "+p.getId()+" category is -"+p.getCategory()+" brand is-"+p.getBrand()+" price is-"+p.getPrice());
		}
	}

}
