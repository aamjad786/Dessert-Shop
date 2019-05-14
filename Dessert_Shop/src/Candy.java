
public class Candy extends DessertItem {

	
	private double weight;
	private double pricePerKg; // Price in Rupies
	private int totalCost;
	
	
	public Candy(String name,double weight, double pricePerKg) {
		super(name);
		this.weight = weight;
		this.pricePerKg = pricePerKg;
	}

	public double getWeight() {
		return weight;
	}

	public double getPricePerKg() {
		return pricePerKg;
	}

	@Override
	public int getCost() {
		this.totalCost = (int)Math.round((this.weight/1000) * this.pricePerKg);
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
		s +=this.weight+"gms"+" @ "+this.pricePerKg+"/Kg \n";
		
		
		return s;
	}

	
	
}
