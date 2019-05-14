
public class IceCream extends DessertItem{

	private double cost;


	public IceCream(String name,double cost) {
		super(name);
		this.cost = cost;
	}


	@Override
	public int getCost() {
		
		return (int)cost;
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
		
		return s;
	}

}
