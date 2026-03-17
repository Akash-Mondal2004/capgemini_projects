package secureInvestment;

import secureInvestment.exceptions.InvalidInvestmentException;

public abstract class InvestmentTransaction implements Authorizable{
	private final String transactionId;
	private final String investorName;
	private final double investedAmount;
	private final InvestmentType investmentType;
	public InvestmentTransaction(String transactionId, String investorName, double investedAmount,
			InvestmentType investmentType) {
	try {
		if(investedAmount<=0) {
			throw new InvalidInvestmentException("Invalid amount investment");
		}
	}catch (InvalidInvestmentException e) {
		System.out.println(e.getMessage());
	}
			
		
		this.transactionId = transactionId;
		this.investorName = investorName;
		this.investedAmount = investedAmount;
		this.investmentType = investmentType;
		System.out.println(toString());
	}
	public String getTransactionId() {
		return transactionId;
	}
	public String getInvestorName() {
		return investorName;
	}
	public double getInvestedAmount() {
		return investedAmount;
	}
	public InvestmentType getInvestmentType() {
		return investmentType;
	}
	
	protected void validatePercent (double percent) {
		try {
			if(percent<0 || percent >30) {
				throw new InvalidInvestmentException("Percent will be greater that 0 or less 30");
			}
		}catch (InvalidInvestmentException e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}
		
	}
	
	
	public abstract InvestmentTransaction applyTax(double tax);
	public abstract InvestmentTransaction applyBonus(double bonus);
	@Override
	public String toString() {
		return "InvestmentTransaction [transactionId=" + transactionId + ", investorName=" + investorName
				+ ", investedAmount=" + investedAmount + ", investmentType=" + investmentType + "]";
	}
	
	
	
}
