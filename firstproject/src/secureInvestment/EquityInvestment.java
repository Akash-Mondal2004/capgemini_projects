package secureInvestment;

import secureInvestment.exceptions.InvalidInvestmentException;
import secureInvestment.exceptions.InvestmentRejectedException;

public class EquityInvestment extends InvestmentTransaction {

	public EquityInvestment(String transactionId, String investorName, double investedAmount) {
		super(transactionId, investorName, investedAmount, InvestmentType.Equity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InvestmentTransaction applyTax(double percent) {
		// TODO Auto-generated method stub
		validatePercent(percent);
		double investedAmount = getInvestedAmount() * (1 - percent/100 * 0.05);
		
		return new DebtInvestment(getTransactionId(),getInvestorName(),investedAmount);
	}

	@Override
	public InvestmentTransaction applyBonus(double percent){
		// TODO Auto-generated method stub
		validatePercent(percent);
		double investedAmount = getInvestedAmount() * (1 + percent/100 * 0.05);
		
		return new DebtInvestment(getTransactionId(),getInvestorName(),investedAmount);
	}

	@Override
	public void authorize() {
		if(getInvestedAmount()<5000) {
			throw new InvestmentRejectedException("Investment must be greater than 5000");
		}
		System.out.println("Equity investment authorized.");
		
	}

	@Override
	public void authorize(String code) {
		// TODO Auto-generated method stub
		if(!code.equals("EQUITY123")) {
			throw new InvestmentRejectedException("incorrect security code");
		}
		System.out.println("Equity investment authorized with security code.");
		
	}

}
