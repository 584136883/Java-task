package work;

public class Computer implements ComputerWeight {
	double cweight;
	Computer(double c) {
		this.cweight = c;
	}

	public double computeWeight() {
		return cweight;

	}
}
