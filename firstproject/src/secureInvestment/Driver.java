package secureInvestment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvestmentTransaction inv1 = new DebtInvestment("TNX1", "Akash", 40000);
		InvestmentTransaction inv2 = new EquityInvestment("TNX2", "Samik", 3000);
		InvestmentTransaction taxed = inv1.applyTax(10);
        InvestmentTransaction bonus = inv2.applyBonus(5);
        
        inv1.authorize("DEBT123");
        inv1.authorize(); 
	}

}
