
public class FordFigoTitanium extends FordFigo{

	int noOfAirbags;
	
	public FordFigoTitanium(String carModelNo, int chasisNo) {
		//super(); - not provided if we provide our super() statement
		super(carModelNo, chasisNo);
		//this.carModelNo = carModelNo;
		//this.chasisNo = chasisNo;
	}

	int airbagsWorking() {
		noOfAirbags = 4;
		System.out.println("Airbags working...." + noOfAirbags);
		return 0;
	}
	
	@Override
	int breakingSystem() {
		//System.out.println("Manual breaking system.....");
		super.breakingSystem();
		System.out.println("ABS breaking system.....");
		return 0;
	}
}
