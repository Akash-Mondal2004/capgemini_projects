package day11;

public class Supporting extends Employee{
	double varpay = 100000;
	@Override
	public double monthlySalCal() {
		return (varpay + basepay)/12;
	}
	
	public double monthlySalCal(int bonus) {
		return (varpay + basepay+bonus)/12;
	}
}
