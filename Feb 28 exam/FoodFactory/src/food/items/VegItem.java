package food.items;

public class VegItem extends FoodItem {

	public VegItem(int id, String name, double price) {
		super(id, name, price);
	}

	@Override
	public void calculateDiscount() {
		double discount = 10;
		this.setPrice(getPrice()*(1-discount/100));
	}
}
