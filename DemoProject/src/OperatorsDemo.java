
public class OperatorsDemo {

	public static void main(String[] args) {

		// 1. Arithmetic operators ----> +, -, *, /, %
		// 2. Relational operators -----> >, < , >=, <=, ==, !=
		// 3. Assignment operator ------> =
		// 4. Arithmetic assignment operator --------> +=, -=, *=, /=, %=
		// 5. Logical operators ------> && , || , !
		// 6. Bitwise operators ------> &, |, !, ^, <<, >>, >>>
		// 7. inc/dec operators -------> ++, --
		
		
		//unary - one operator one operand
		// inc
		// dec
		
		//binary - one operator two operands
		
		//ternary - two operator three operands
		//conditional 
		// int c = a>b?a:b;
		
		int answer = greaterLogic(4, 8);
		System.out.println("greater number is:" + answer);
		
		
		// input , process, output
		// input and output in main method
		// process in a seperate method - bussiness logic method
	}
	
	static int greaterLogic(int numberOne, int numberTwo) {
		return numberOne>numberTwo?numberOne:numberTwo;
	}

	
}
