
public class FordFigo {
	String carModelNo;
	int chasisNo;
	String color;

	public FordFigo(String carModelNo, int chasisNo) {
		this.carModelNo = carModelNo;
		this.chasisNo = chasisNo;
	}

	int switchOn() {
		System.out.println("Car switched on.....");
		return 0;
	}
	
	int switchOff() {
		System.out.println("Car switched off.....");
		return 0;
	}
	
	int breakingSystem() {
		System.out.println("Manual breaking system.....");
		return 0;
	}
}
