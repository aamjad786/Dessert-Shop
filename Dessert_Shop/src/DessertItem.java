

public abstract class DessertItem {
	
	
	private String name;
	
	private static final int MAX_ITEM_NAME_SIZE=25;
	
	public DessertItem() {
		this("");
	}
	
	public DessertItem(String name) {
		if (name.length() <= MAX_ITEM_NAME_SIZE)
			this.name = name;
		else
			this.name = name.substring(0, MAX_ITEM_NAME_SIZE);
	}
	
	public final String getName() {
		return name;
	}
	
	public abstract int getCost();
	
}
