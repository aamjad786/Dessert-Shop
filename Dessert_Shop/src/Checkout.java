import java.util.ArrayList;
import java.util.Iterator;



public class Checkout {

	private static final int TAX_RATE=5; //5% GST
	public static final int LINE_WIDTH = 40;
	private ArrayList<DessertItem> items;
	private int numberofitems=0;
	
	
	public Checkout() {
		items=new ArrayList<>();
		numberofitems=items.size();
	}


	public int getNumberofitems() {
		numberofitems=items.size();
		return numberofitems;
	}
	
	
	public void addItem(DessertItem item) {
		items.add(item);
	}
	
	public void clear(){
		items.clear();
	}
	
	public int totalCost() {
		int sum = 0;
		
		Iterator<DessertItem> iterate=items.iterator();
		
		while(iterate.hasNext())
			sum +=(int)iterate.next().getCost();
		
		return sum;
	}
	
	public int totalTax() {
		return (int)Math.round(this.totalCost() * TAX_RATE / 100.00);
	}
	
	public void viewCart() {
		System.out.println("---------------------------------------------------------");
		System.out.println("                      CART ITEMS");
		System.out.println("---------------------------------------------------------");
		
		for (DessertItem dessertItem : items) {
			System.out.println(dessertItem);
		}
		
		System.out.println("---------------------------------------------------------");
	}
	
	public void getReciept(){
		
		System.out.println("---------------------------------------------------------");
		System.out.println("                      Reciept");
		System.out.println("---------------------------------------------------------");
		
		
		for (DessertItem dessertItem : items) {
			System.out.println(dessertItem);
		}
		
		String label1="Total Amount(A):-";
		String label2="Total Tax (GST 5%)(B):-";
		String label3="Total Bill Amount(A+B):-";
		String label4="Total Number of Items:-";
		
		while(label1.length()< Checkout.LINE_WIDTH - String.valueOf(this.totalCost()).length())
			label1+=" ";
		
		while(label2.length()< Checkout.LINE_WIDTH - String.valueOf(this.totalTax()).length())
			label2+=" ";
		
		while(label3.length()< Checkout.LINE_WIDTH - String.valueOf(this.totalCost()+this.totalTax()).length())
			label3+=" "; 

		while(label4.length()< Checkout.LINE_WIDTH - String.valueOf(this.getNumberofitems()).length())
			label4+=" ";
		
		System.out.println("---------------------------------------------------------");
		System.out.println(label4+this.getNumberofitems());
		System.out.println(label1+ this.totalCost()+" Rs");
		System.out.println(label2+this.totalTax()+" Rs");
		System.out.print(label3);
		System.out.println(this.totalCost()+this.totalTax()+" Rs");
		System.out.println("---------------------------------------------------------");
	}
	
}
