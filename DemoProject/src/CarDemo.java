
public class CarDemo {

	public static void main(String[] args) {

		SkodaFabia fabia1 = new SkodaFabia();
		fabia1.switchOn();
		fabia1.switchOff();
		fabia1.engineStart();
		fabia1.engineStop();
		
		Car fabia2 = new SkodaFabia();
		fabia2.switchOn();
		fabia2.switchOff();
		// fabia2.engineStart(); - compiler error
		// fabia2.engineStop(); - compiler error
		
	}

}
