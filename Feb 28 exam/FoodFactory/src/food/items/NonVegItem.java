package food.items;

public class NonVegItem extends FoodItem {

	public NonVegItem(int id, String name, double price) {
		super(id, name, price);
	}

	@Override
	public void calculateDiscount() {
		double discount = 5;
		this.setPrice(getPrice()*(1-discount/100));
	}
}
