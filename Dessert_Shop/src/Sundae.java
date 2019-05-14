
public class Sundae extends IceCream {

	private int toppingprice;
	private String toppingname;
	private int totalCost;
	
	
	public Sundae(String name, int cost,int toppingprice,String toppingname) {
		super(name, cost);
		this.toppingname=toppingname;
		this.toppingprice=toppingprice;
		
	}

	public String getToppingname() {
		return toppingname;
	}

	@Override
	public int getCost() {
		this.totalCost=this.toppingprice+super.getCost();
		return totalCost;
	}
	
	@Override
	public String toString() {

		String s="";

		String name=this.getName()+" (Sundae)";
		
		while(name.length() < Checkout.LINE_WIDTH - String.valueOf(this.getCost()).length() ){
			name += " ";
		}
		
		s +=name;
		s +=this.getCost()+" Rs"+"\n";
		s +="With Topping "+this.toppingname;
		
		
		return s;
	}
	

}
