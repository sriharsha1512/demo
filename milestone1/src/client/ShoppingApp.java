package client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

import Entity.Product;
import Exceptions.IdNotFoundException;
import services.PrintService;
import services.serviceImp.PrintServiceImp;

public class ShoppingApp {

	public static void main(String[] args) throws IdNotFoundException {
		ArrayList<Product> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("***Welcome to Shopping management system***");
			System.out.println("1) Add a new Product ,id,author");
			System.out.println("2) List all Product name and id");
			System.out.println("3) Search Product with id");
			System.out.println("4) Edit product by name");
			System.out.println("5) Delete Product by Id");
			System.out.println("6) Sorting the products based on price");
			System.out.println("7) Exit");
			int ch=sc.nextInt();
			if(ch>=7)
			{
				break;
			}
			else
			{
				switch(ch)
				{
					case 1:
						sc.nextLine();
						System.out.println("Enter the product name:");
						String name=sc.nextLine();
						System.out.println("Enter the product id:");
						int id=sc.nextInt();
						System.out.println("Enter the Category");
						String cat=sc.next();
						System.out.println("Enter the brand");
						String brand=sc.next();
						System.out.println("Enter the price");
						int price=sc.nextInt();
						al.add(new Product(name,id,cat,brand,price));
						break;
					case 2:
						//polymorphism behaviour
						PrintService p=new PrintServiceImp();
						p.display(al);
						break;
						
						  //using lambda expression
						  //al.forEach((Product)p ->System.out.println("name is -"+p.getName()+" id is "+p.getId()+" category is -"+p.getCategory()+" brand is-"+p.getBrand()+" price is-"+p.getPrice()));
						 
					case 3:
							if(al.isEmpty())
							{
								System.out.println("List is Empty");
								
							}
							else
							{
								boolean flag=true;
								System.out.println("Enter id to be checked");
								int checkid=sc.nextInt();
								try
								{
									for(Product p1:al)
									{
										if(p1.getId()==checkid)
										{
											System.out.println("Product found");
											flag=false;
										}
									}
									if(flag)
									{
										throw new IdNotFoundException("product id not found");
									}
									
								}
								catch(IdNotFoundException e)
								{
									System.out.println("Exception caught"+e);
								}
							}
							break;
					case 4:
							System.out.println("Enter the product name");
							sc.nextLine();
							String previous_name=sc.nextLine();
							System.out.println("Enter the new product name");
							String new_name=sc.nextLine();
							for(Product p1:al)
							{
								if(p1.getName()==previous_name)
								{
									p1.setName(new_name);
								}
							}
						break;
					case 5:
						if(al.isEmpty())
						{
							System.out.println("List is Empty");
							
						}
						else
						{
							boolean flag=true;
							System.out.println("Enter id of product to be removed");
							int removeid=sc.nextInt();
							ListIterator<Product> li=al.listIterator();
							try
							{
								while(li.hasNext())
								{
									if(li.next().getId()==removeid)
									{
										li.remove();
										flag=false;
									}
								}
								if(flag)
								{
									throw new IdNotFoundException("Id not found");
								}
							}
							catch(IdNotFoundException e)
							{
								System.out.println("Exception caught"+e);
							}
						}
						break;
					case 6:
						Collections.sort(al);
						break;
						
					
				}
			}
			
		}

	}

}
