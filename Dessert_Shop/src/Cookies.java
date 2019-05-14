
public class Cookies extends DessertItem {

	private int numberofcookies;
	private double priceperdozen;
	private int totalCost;
	
	
	
	
	public Cookies(String name,int numberofcookies, double priceperdozen) {
		super(name);
		this.numberofcookies = numberofcookies;
		this.priceperdozen = priceperdozen;
	}

	public int getNumberofcookies() {
		return numberofcookies;
	}

	public double getPriceperdozen() {
		return priceperdozen;
	}
	
	@Override
	public int getCost() {
		this.totalCost = (int)Math.round(numberofcookies / 12.0 * priceperdozen);
		return totalCost;
	}

	@Override
	public String toString() {
		String s="";
		

		String name=this.getName();
		
		while(name.length() < Checkout.LINE_WIDTH - String.valueOf(this.getCost()).length() ){
			name += " ";
		}
		
		s +=name;
		s +=this.getCost()+" Rs"+"\n";
		s +=this.numberofcookies+" Cookies @ "+this.priceperdozen+"/Dz \n";
		
		return s;
	}


	


	

}
