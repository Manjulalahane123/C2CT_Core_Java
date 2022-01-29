package datatypes_variable_op; 

// In this code we have shown the use of bitwise operators
// Bitwise operators deals with the bits operations

public class bitwise_demo {

	public static void main(String[] args) {
		
		//OR and AND bitwise operator
		int a = 25, b = 15;// a = 11001, b = 1111
		int c = a|b; // o/p--> 11111-->31
		System.out.println("OR operator on a: "+a+ " and b:"+b+" -->"+c);
		int g= a&b; // o/p-->01001-->9.
		System.out.println("AND operator on a: "+a+ " and b:"+b+" -->"+g);
		
		//right and left shift operator.
		int e = 25;
	        double  f = e>>2;
		System.out.println("Right shift operation on e: "+f);
		double  j = e<<2;
		System.out.println("Left shift operation on e: "+j);
	}

}
