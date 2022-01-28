package datatypes_variable_op;

// In this code we have shown the how logical operators works.
// Result of logical operators are boolean type.
// Before doing logical operators we must understand the work of logical gates, because the same concpt is used in logical operator.

public class logical_op {
	public static void main(String[] args) {
		
		// Declaring int local variables.
		int num1 = 7,  num2 = 7;
		
		
		// AND logical operator
		if ((num1==num2) && (num1>6)){
			System.out.println("True");
		}
		
		// OR logical operator
		if ((num1<3) || (num2==5)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		// NOT operator
		boolean human = true;
		if (!human){
			System.out.println("I am human");
		}else {
			System.out.println("I am not a human");
		}
		
		// Ternary operator
		int x, y;  
		x = 20;  
		y = (x == 1) ? 61: 90;  
		System.out.println("Value of y is: " +  y);  
		y = (x == 20) ? 61: 90;  
		System.out.println("Value of y is: " + y);
		
	}

}
