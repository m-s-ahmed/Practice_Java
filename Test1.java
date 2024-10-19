//Java Assignment 1

import java.util.ArrayList;
import java.util.Scanner;

class Item{

		String name;
		String type;
		double price;
		int quantity;

		Item(String name, String type, double price,int quantity){
				this.name=name;
				this.type=type;
				this.price=price;
				this.quantity=quantity;
			}

		public String getName(){
				return name;
			}
		public String getType(){
				return type;
			}
		public double getPrice(){
				return price;
			}
		public void setQuantity(int q){
				quantity=quantity+q;
			}
		public int getQuantity(){
				return quantity;
			}
	}



class Inventory{
		Scanner sc=new Scanner(System.in);
		ArrayList<Item> itemList=new ArrayList<Item>();

		void addItem(Item item){
				itemList.add(item);
			}
		 public void displayItems(){
			 	for(Item item:itemList){
						System.out.print("Item Name: ");
						System.out.println(item.getName());
						System.out.print("Item Type: ");
						System.out.println(item.getType());
						System.out.print("Item Price: ");
						System.out.println(item.getPrice());
						System.out.print("Item Quantity: ");
						System.out.println(item.getQuantity());
						System.out.println();
					}
			 }

		 public void categoryWiseDisplay(){
			 	System.out.println("----Fruit items are----");
			 	for(Item item:itemList){
						if(item.getType().equals("Fruit")){
							System.out.print("Item Name: ");
							System.out.println(item.getName());
							System.out.print("Item Type: ");
							System.out.println(item.getType());
							System.out.print("Item Price: ");
							System.out.println(item.getPrice());
							System.out.print("Item Quantity: ");
							System.out.println(item.getQuantity());
							System.out.println();
							}
					}

				System.out.println("----Vegetable items are----");
				for(Item item:itemList){
						if(item.getType().equals("Vegetable")){
							System.out.print("Item Name: ");
							System.out.println(item.getName());
							System.out.print("Item Type: ");
							System.out.println(item.getType());
							System.out.print("Item Price: ");
							System.out.println(item.getPrice());
							System.out.print("Item Quantity: ");
							System.out.println(item.getQuantity());
							System.out.println();
							}
					}

			public void search_item(String name){
				for(Item item:itemList){
						if(item.getName().equals(name)){
							System.out.print("Item Name: ");
							System.out.println(item.getName());
							System.out.print("Item Type: ");
							System.out.println(item.getType());
							System.out.print("Item Price: ");
							System.out.println(item.getPrice());
							System.out.print("Item Quantity: ");
							System.out.println(item.getQuantity());
							System.out.println();
							}
						}

			public void purchase_sell(){
				System.out.println("What do you want to do: \n 1.Purchase\n2.Sell\n");
				int b=sc.nextInt();
				System.out.println("Which item: ");
				String name=sc.next();

				for(Item item:itemList){
						if(item.getName().equals(name)){
							if(b==1){
								System.out.print("Enter Quantity:");
								int q=sc.nextInt()p
								item.setQuantity(q);
								return;

							else if(b==2){
								System.out.print("Enter Quantity: ");
								int q=sc.nextInt();
								item.setQuantity((-1)*q);
								return;
								}

							else{
								System.out.println("Invalid");
							}
						}
					}
				}
	}

class Test1{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			Inventory a=new Inventory();

			System.out.println("How many number of item you want to add: ");
			int n=sc.nextInt();

			for(int j=1;j<n+1;j++){
				System.out.print("Enter #"+j+"item name:");
				String name=sc.next();
				System.out.print("Enter #"+j+"item type:");
				String type=sc.next();
				System.out.print("Enter #"+j+"item price:");
				double price=sc.nextDouble();
				System.out.print("Enter #"+j+"item quantity:");
				int quantity=sc.nextInt();
				a.additem(new Item(name,type,price,quantity));
			}

				a.displayitem();
				a.categoryWiseDisplay();
				System.out.print("Search an item by name:");
				String name;
				name=sc.next();
				a.search_item(name);
				a.purchase_sell();
				System.out.println("Afetr buy or sell>>>>>");
				a.displayitem();

		}
	}