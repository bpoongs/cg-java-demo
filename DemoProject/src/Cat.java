
public class Cat extends Animal{

	public Cat() {
		System.out.println("in cat constructor");
	}
	
	@Override
	int makeSound() {
		System.out.println("Cat meows....");
		return 0;
	}
	
	int scratches() {
		System.out.println("Cat scratches....");
		return 0;
	}

	@Override
	int eat() {
		System.out.println("cat licks....");
		return 0;
	}
}
