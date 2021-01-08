public class Car {
	private int numberOfWheels = 4;
	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return numberOfWheels;
	}

	public int start() {
		return engine.start();
	}

	public boolean isHighClass(int prize) {
		return (prize > 100 ? true : false);
	}

	public int getManyWheels() {
		for (int i = 0; i < 1000; i++) {
			System.out.println();
		}
		return 4;
	}

}
