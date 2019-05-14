import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Shop {


	public static void main(String[] args) throws IOException {
		 
		int ch;
		Scanner sc=new Scanner(System.in);
		Checkout cart=new Checkout();
		
		System.out.println("-----------------------------------------------");
		System.out.println("        Delicieux - The Dessert Shop");
		System.out.println("-----------------------------------------------");
		
		System.out.println("\n         WELCOME TO OUR SHOP....! ");
		while (true) {
		
				System.out.println("\n-----------------------------------------------");
		        System.out.println("            KINDLY CHOOSE OPTIONS ");
		        System.out.println("-----------------------------------------------");
		        System.out.println("\t1) Add Item In Cart" + "\n"
		                + "\t2) Remove Items From Cart \n"
		        		+"\t3) View Cart Items \n"
		                +"\t4) Print Reciept \n"
		                +"\t0) Exit " + "\n"
		                 );
		        
		        System.out.print("ENTER CHOICE:-");
		        ch = sc.nextInt();
		        
		        
		        switch(ch){
		        	
		        case 0:
		        	System.out.println("\n" + "Thanks for Visiting...Good Bye!");
		        	System.exit(0);
		        	
		        case 1:
		        	System.out.println("\n-----------------------------------------------");
		        	System.out.println("           CHOOSE ITEM TO ADD");
		        	System.out.println("-----------------------------------------------");
		        	System.out.println(" 1)Candy | 2)Cookies | 3)IceCream | 4)Sundae");
		        	System.out.println("-----------------------------------------------");
		        	System.out.print("ENTER CHOICE:-");
		        	ch=sc.nextInt();
		        	
		        	if(ch==1)
		        	{
		        		String name;
		        		double weight;
		        		double price;
		        		
		        		System.out.print("Enter Candy Name:-");
		        		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        		name=br.readLine();
		        		
		        		System.out.print("Enter Weight in \"Grams\":-");
		        		weight=sc.nextDouble();
		        		
		        		System.out.print("Enter Pice (Per KG) :-");
		        		price=sc.nextDouble();
		        		
		        		cart.addItem(new Candy(name, weight, price));
		        	
		        	}
		        	else if(ch==2)
		        	{
		        		String name;
		        		int numberofcookies;
		        		int price;
		        		
		        		System.out.print("Enter Cookies Name:-");
		        		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        		name=br.readLine();
		        		
		        		System.out.print("Enter Number of Cookies:-");
		        		numberofcookies=sc.nextInt();
		        		
		        		System.out.print("Enter Pice (Per DOZEN) :-");
		        		price=sc.nextInt();
		        		
		        		cart.addItem(new Cookies(name, numberofcookies, price));
		        		
		        	}
		        	if(ch==3)
		        	{
		        		String name;
		        		double cost;
		        		
		        		System.out.print("Enter Ice-Cream Name:-");
		        		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        		name=br.readLine();
		        		
		        		System.out.print("Enter Cost of Ice-Cream:-");
		        		cost=sc.nextDouble();
		        		
		        		cart.addItem(new IceCream(name, cost));
		        		
		        	}
		        	else if(ch==4)
		        	{
		        		String name;
		        		int cost;
		        		int toppingprice;
		        		String toppingname;
		        		
		        		System.out.print("Enter Ice-Cream Name:-");
		        		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        		name=br.readLine();
		        		
		        		System.out.print("Enter Cost of Ice-Cream:-");
		        		cost=sc.nextInt();
		        		
		        		System.out.print("Enter Topping Name:-");
		        		toppingname=br.readLine();
		        		
		        		System.out.print("Enter Topping Price:- ");
		        		toppingprice=sc.nextInt();
		        		
		        		cart.addItem(new Sundae(name, cost, toppingprice, toppingname));
		        		
		        	}
		        	
		        	break;
		        	
		        case 2:
		        	cart.clear();
		        	System.out.println("Your Cart Is Empty Now......!");
		        	break;
		        	
		        case 3:
		        	cart.viewCart();
		        	break;
		        	
		        case 4:
		        	cart.getReciept();
		        	System.out.println("\n" + "\tThanks for Visiting Us......!");
		        	System.exit(0);
		        	break;
		        	
		        }
		 }

	}

}
