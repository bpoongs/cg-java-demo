
public class PrimitivesDemo {

	public static void main(String[] args) {

		// 8 primitive data types
		// whole numbers - byte ( 1 byte ) , short ( 2 bytes ) , int ( 4 bytes ), long ( 8 bytes )
		// decimal numbers - float, double
		// boolean
		// char
		
		int marks = 100;
		double rate = 4.5;
		boolean flag = true;
		// boolean result = 0; invalid in java
		char option = 'y';
		
		// type casting - implicit casting and explicit casting
		// -------- -------- // i
		// 00000000 00000101  // i
		// -------- -------- -------- --------  //k
		// 00000000 00000000  00000000 00000101  //k
		// -------- -------- //n
		short i = 5;
		int k = i;// implicit casting
		
		// short n = k;
		short n = (short)k; // explicit casting
		
		//float avg = 23.5;
		//float avg = (float)23.5;
		//float avg = 23.5F; 
		float avg = 23.5f; // recomended
		
		boolean f = false;
		
		char ch = 'h';
		
		System.out.println(ch);
		
		int ch1 = (int)ch;
		System.out.println(ch1);
		
		char ch2 = (char)ch1;
		System.out.println(ch2);
		
		
		
		
		
	}

}
