
public class ExhibitionDemo {

	public static void main(String[] args) {

		Exhibition exhibition = new Exhibition();
		
		Cat cat = new Cat();
		exhibition.exhibit(cat);
		
		System.out.println("-----------------");
		
		Dog dog = new Dog();
		exhibition.exhibit(dog);
	}

}
