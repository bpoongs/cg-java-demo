
public class Exhibition {

	/*
	void exhibit(Cat cat) {
		cat.breathe();
		cat.mobility();
		cat.makeSound();
		cat.scratches();
	}
	
	void exhibit(Dog dog) {
		dog.breathe();
		dog.mobility();
		dog.makeSound();
		dog.bites();
	}*/
	
	void exhibit(Animal animal) {
		animal.breathe();
		animal.mobility();
		animal.makeSound();
		if(animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.scratches();
		}else if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.bites();
		}
	}
}
