package secureInvestment;

import secureInvestment.exceptions.InvalidInvestmentException;
import secureInvestment.exceptions.InvestmentRejectedException;

public class DebtInvestment extends InvestmentTransaction {

	public DebtInvestment(String transactionId, String investorName, double investedAmount) {
		
		super(transactionId, investorName, investedAmount, InvestmentType.Debt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InvestmentTransaction applyTax(double percent) {
		// TODO Auto-generated method stub
		validatePercent(percent);
		double investedAmount = getInvestedAmount() * (1 - percent/100);
		
		return new DebtInvestment(getTransactionId(),getInvestorName(),investedAmount);
	}

	@Override
	public InvestmentTransaction applyBonus(double percent) {
		// TODO Auto-generated method stub
		validatePercent(percent);
		double investedAmount = getInvestedAmount() * (1 + percent/100);
		
		return new DebtInvestment(getTransactionId(),getInvestorName(),investedAmount);
	}
	
	@Override
	public void authorize() {
		if(getInvestedAmount()<10000) {
			throw new InvestmentRejectedException("Investment must be greater than 10000");
		}
		System.out.println("Debt investment authorized");
		
	}

	@Override
	public void authorize(String code) {
		// TODO Auto-generated method stub
		if(!code.equals("DEBT123")) {
			throw new InvestmentRejectedException("incorrect security code");
		}
		System.out.println("Debt investment authorized with security code.");
		
	}


}
