package fi.talwenzari.ostoslista.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
	private List<ShoppingListItem> items = new ArrayList<ShoppingListItem>();

	public ShoppingList() {
		super();
	}
	
	public void addItem(ShoppingListItem item) {
		items.add(item);
	}

	public List<ShoppingListItem> getItems() {
		return items;
	}
}
