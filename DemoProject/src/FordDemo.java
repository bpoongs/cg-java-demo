
public class FordDemo {
	public static void main(String[] args) {
		FordFigo ff1 = new FordFigo("FF101", 1234);
		ff1.switchOn();
		ff1.breakingSystem();
		ff1.switchOff();
		
		System.out.println("------------------------------");
		
		FordFigoTitanium fft1 = new FordFigoTitanium("FFT201", 7891);
		fft1.switchOn();
		fft1.breakingSystem();
		fft1.airbagsWorking();
		fft1.switchOff();
	}
}

//types of inheritance
//1) Single level inheritance
//2) Multilevel inheritence
// class A{}
// class B extends A{}
// class C extends B{}
//3) Heirarchical inheritance
//4) Multiple inheritence - not supported in java - class C extends A, B - this is not possible
//

// Polymorphism
// 1) method overloading
//      - methods with same name and different arguments (order, type, number)
//      - we do not consider the return type in method overloading
//      - merely for convinience sake
//      - can we have method overloading in a single class? - yes
//      - can we have method overloading in a parent-child class? - yes
// 2) method overriding
//		- can we have method overriding in a single class? -
//		- can we have method overriding in a parent-child class? - 
// 		- two methods with the same signature(return type, method name and the arguments) in the parent and child class
//		- the return type is considered













