package src.exampleRefactor.version4;

abstract class Printer {
	private String ID;

	public Printer(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	public void testPrinting() {
		System.out.println("테스트 프린트");
	}

	public void print(Object msg) {
		if (isPrintable()) {
			printing(msg);
		} else {
			alert();
		}
	}
	abstract public void printing(Object msg);
	abstract public boolean isPrintable();
	abstract public void alert();
}
