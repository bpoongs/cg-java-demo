
public class Dog extends Animal{

	public Dog() {
		System.out.println("in dog constructor....");
	}

	@Override
	int makeSound() {
		System.out.println("Dog barks....");
		return 0;
	}
	
	int bites() {
		System.out.println("Dog bites....");
		return 0;
	}
	
	@Override
	int eat() {
		System.out.println("dog tears the food....");
		return 0;
	}
}
