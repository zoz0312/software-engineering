package src.exampleRefactor.version4;

public class PrintCartridge {
	private double capacity;
	private double reductionRate;

	public PrintCartridge (double capacity, double reductionRate) {
		this.capacity = capacity;
		this.reductionRate = reductionRate;
	}

	public double getCapacity () {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getReductionRate () {
		return this.reductionRate;
	}
}
