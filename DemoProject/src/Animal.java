
abstract public class Animal {

	public Animal() {
		System.out.println("in animal constructor");
	}

	int breathe() {
		System.out.println("Animal breathes...");
		return 0;
	}
	
	int mobility() {
		System.out.println("Animal moves....");
		return 0;
	}
	
	int makeSound() {
		System.out.println("Animals make sound....");
		return 0;
	}
	
    abstract int eat();
}

// when a class contains atleast one abstract method then the class becomes an abstract class
// when a class is abstract
//		- we cannot create an object for an abstract class
//      - abstract classes are meant to be inherited
