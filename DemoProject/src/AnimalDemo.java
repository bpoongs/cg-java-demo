
public class AnimalDemo {

	public static void main(String[] args) {
		//Animal animal1 = new Animal();
		//animal1.breathe();
		//animal1.mobility();
		//animal1.makeSound();
		
		System.out.println("---------------");
		
		Cat cat = new Cat();
		cat.breathe(); // method in super class
		cat.mobility(); // method in super class
		cat.makeSound(); // overriding method in sub class
		cat.scratches(); // extra method in sub class
		
		System.out.println("---------------");
		
		Dog dog = new Dog();
		dog.breathe();  // method in super class
		dog.mobility();  // method in super class
		dog.makeSound();  // overriding method in sub class
		dog.bites();  // extra method in sub class
		
		System.out.println("---------------");
		
		//Animal a = new Animal();
		Animal animal = new Cat();
		animal.breathe();
		animal.mobility();
		animal.makeSound();
		//animal.scratches(); // compiler error
		
		Cat cat1 = (Cat)animal; // explicit casting - downcasting
		cat1.scratches();
		
		Animal animal2 = cat1; // implicit casting - upcasting
		
		//animal1.scratches(); // compiler error
		
		
		
		
		
		
		
		
		
		
	}

}
