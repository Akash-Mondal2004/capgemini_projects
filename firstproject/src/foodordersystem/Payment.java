package foodordersystem;

import foodordersystem.exceptions.PaymentFailedException;

public interface Payment {
	void pay(double amount) throws PaymentFailedException;
	void pay(double amount, String cuponcode) throws PaymentFailedException;
}
