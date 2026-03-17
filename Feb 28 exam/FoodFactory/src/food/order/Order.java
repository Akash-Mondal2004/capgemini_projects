package food.order;

import java.util.ArrayList;
import java.util.List;

import food.items.FoodItem;

public class Order {
	public List<FoodItem> order = new ArrayList<>();
	
	public void add(FoodItem food) {
		order.add(food);
	}
	
	public double calculateTotalBill() {
		double bill = 0;
		for (FoodItem item : order) bill += item.getPrice();
		return bill;
	}
}
