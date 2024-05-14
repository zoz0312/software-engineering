package src.exampleRefactor.version2;

abstract class Printer {
	private String ID;

	public Printer(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	abstract public void print(Object msg);

	public void testPrinting() {
		System.out.println("테스트 프린트");
	}
}
