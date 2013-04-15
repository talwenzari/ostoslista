package fi.talwenzari.ostoslista.model;

public class ShoppingListItem {
	private String name;
	private int rank;
	private ItemState state;
	
	public ShoppingListItem(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
		this.state = ItemState.ACTIVE;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}

	public ItemState getState() {
		return state;
	}
	
	
}
