package foodordersystem;

import foodordersystem.exceptions.PaymentFailedException;

public class UpiPayment implements Payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		
		if(amount>5000) {
			throw new PaymentFailedException("Payment limit exceed");
		}
		System.out.println("Payment of ₹" + amount + " successful via UPI.");
		
		
	}

	@Override
	public void pay(double amount, String couponcode){
		// TODO Auto-generated method stub
		 double discount = amount * 0.1;
	     double finalAmount = amount - discount;
	     pay(finalAmount);
	     System.out.println("Coupon applied: " + couponcode);
		
	}
	
	

}
