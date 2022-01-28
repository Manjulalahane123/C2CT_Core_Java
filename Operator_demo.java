package datatypes_variable_op;

// In this code we implemented the different types of operator.

public class Operator_demo {

	public static void main(String[] args) {
		
		// Declaring the int datatype for operation.
		int num1 = 14, num2 = 2;
		int res = num1 + num2;
		int res1 = num1 - num2;
		int num3 = 3;
		int res2 = num2 * num2;
		
		// Declaring the float datatype and also with typecasting to convert int to float.
		float res3 = (float)num1/num3;
		
		//Printing the output of opreations on console.
		System.out.println("===========================================");
		System.out.println("Result of addition operator: "+res);
		System.out.println("Result of subtraction operator: "+res1);
		System.out.println("Result of multipication operator: "+res2);
		System.out.println("Result of division operator: "+res3);
		System.out.println("===========================================");
		int res4;
		System.out.println("===========================================");
		res4 = num2%num3; // modulus means remainder of division operation.
		System.out.println("Result of Modulus operator: "+res4);
		System.out.println("Result of Modulus operator: "+44432%55);
		System.out.println("===========================================");
		
		// ADD and SUB assignment operation
		System.out.println("Add assignment: "+(num1+=num2)); // i.e.. num1 = num1 + num2
		System.out.println("Sub assignment: "+(num1-=num2)); // i.e.. num1 = num1 - num2
		System.out.println("Mul assignment: "+(num1*=num2)); // i.e.. num1 = num1 * num2
		System.out.println("Div assignment: "+(num1/=num2)); // i.e.. num1 = num1/num2
		System.out.println("===========================================");
		
		// Increment and decrement operator
		// Inc and dec a single value
		int num4 = 8;
		num4++; // i.e.. num4 = num4 + 1
		System.out.println(" Inc a single value: " +num4);
		num4--; // i.e.. num4 = num4 - 1
		System.out.println(" Inc a single value: " +num4);
		System.out.println("==================Pre Inc and dec=========================");
		
		// Pre-increment/decrement and post-increment/decrement
		int m = 3, n = 5;
		System.out.println("m: "+m+" ,n: "+n);
		
		//pre-inc-drc
		System.out.println("Before pre-inc operation on m: "+m+" ,n: "+n);
		m = ++n;
		System.out.println("After pre-inc operation on m: "+m+" ,n: "+n);
		System.out.println("Before pre-dec operation on m: "+m+" ,n: "+n);
		m = --n;
		System.out.println("After pre-dec operation on m: "+m+" ,n: "+n);
		
		
		System.out.println("==================Post Inc and Dec=========================");
		int a = 4, b = 6;
		System.out.println("a: "+a+" ,b: "+b);
		System.out.println("Before post-inc operation on a: "+a+" ,b: "+b);
		a = b++;
		System.out.println("After post-inc operation on a: "+a+" ,n: "+b);
		System.out.println("Before post-dec operation on a: "+a+" ,b: "+b);
		a = b--;
		System.out.println("After post-dec operation on a: "+a+" ,n: "+b);
		int ab=12, ba = 8;
		ba=ab--;
		System.out.println("-->ab: "+ab+", ba: "+ba);
		System.out.println("Modulus Assigment");
		System.out.println(ab%=ba);
		}

}
