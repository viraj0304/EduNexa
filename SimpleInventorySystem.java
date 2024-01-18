package edunexa;

import java.util.ArrayList;
import java.util.Scanner;

class InventoryItem 
{
    String name;
    int quantity;

    public InventoryItem(String name,int qnt) 
    {
        this.name=name;
        this.quantity=qnt;
    }
}


public class SimpleInventorySystem 
{
    static ArrayList<InventoryItem> inventory = new ArrayList<>();
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        while (true) 
        {
        	System.out.println("Menues:");
        	System.out.println("\n");
            System.out.println("1.Add New Item");
            System.out.println("2.Update Existing Item");
            System.out.println("3.View Items In Inventory");
            System.out.println("4.Exit");
        	System.out.println("\n");
            System.out.print("Enter your choice:");

            int chc = scanner.nextInt();
            
            scanner.nextLine();

            switch (chc) 
            {
                case 1:
                    additem();
                    break;
                    
                case 2:
                    updateitem();
                    break;
                    
                case 3:
                    viewitems();
                    break;
                    
                case 4:
                	System.out.println("Exiting the program");
                    System.exit(0);
                    
                default:
                    System.out.println("Wrong choice.Please try again");
            }
        }
    }

    static void additem() 
    {
    	System.out.print("Enter item name:");
    	String name=scanner.nextLine();
    
    	System.out.print("Enter item quantity:");
    	int quantity=scanner.nextInt();

    	InventoryItem newItem=new InventoryItem(name,quantity);
    	inventory.add(newItem);

    	System.out.println("Your New Item Added Successfully");
    }

	static void updateitem() 
	{
		System.out.print("Enter Item Name which you want to update:");
		String name = scanner.nextLine();

		boolean found = false;
    
		for (InventoryItem item : inventory) 
		{
			if (item.name.equals(name)) 
			{
				System.out.print("Enter quantity: ");
				int newQuantity = scanner.nextInt();
				item.quantity = newQuantity;
				found = true;
				System.out.println("Updated successfully");
				break;
			}
		}

		if (!found) 
		{
			System.out.println("Invalid Item");
		}
	}

	static void viewitems() 
	{
		System.out.println("\n");
		System.out.println("Inventory Items:");
		System.out.println("\n");
    
		for (InventoryItem item : inventory) 
		{
			System.out.println("Name:"+item.name+",Quantity:"+item.quantity);
		}
	}
}
