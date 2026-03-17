package food.order;

import java.util.HashMap;
import java.util.Scanner;

import food.items.FoodItem;
import food.items.NonVegItem;
import food.items.VegItem;

public class Driver {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		FoodItem vegPulao = new VegItem(1, "Veg Pulao", 40);
		FoodItem chickenBiryani = new NonVegItem(2, "Chicken Biryani", 60);
		FoodItem vegetable = new VegItem(3, "Daily Vegetable", 20);
		FoodItem eggOmlette = new NonVegItem(4, "Egg Omlette", 10);
		
		HashMap<Integer, FoodItem> map = new HashMap<>();
		map.put(1, vegPulao);
		map.put(2, chickenBiryani);
		map.put(3, vegetable);
		map.put(4, eggOmlette);
		
		System.out.println("Welcome to Food Store: ");
		System.out.println("Menu:");
		System.out.println("1. Veg Pulao (discount)");
		vegPulao.calculateDiscount();
		System.out.println("2. Chicken Biryani (discount)");
		chickenBiryani.calculateDiscount();
		System.out.println("3. Daily Vegetable");
		System.out.println("4. Egg Omlette");
		
		System.out.println("Enter your choice to add to list (Enter 0 to exit):");
		int i = sc.nextInt();
		Order o = new Order();
		while (i!=0) {
			o.add(map.get(i));
			i = sc.nextInt();
		}
		System.out.println("Total Bill: " + o.calculateTotalBill());
	}
}
