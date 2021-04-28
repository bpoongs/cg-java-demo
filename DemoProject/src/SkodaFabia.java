
public class SkodaFabia implements Car{

	@Override
	public int switchOn() {
		System.out.println("Car switched on....");
		engineStart();
		return 0;
	}

	@Override
	public int switchOff() {
		System.out.println("Car switched off....");
		engineStop();
		return 0;
	}
	
	int engineStart() {
		System.out.println("engine started....");
		return 0;
	}
	
	int engineStop() {
		System.out.println("engine stopped....");
		return 0;
	}
}
