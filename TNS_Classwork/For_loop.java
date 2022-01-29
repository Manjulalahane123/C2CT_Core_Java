package loops_pack;

// In this code we will see how to use for loop.

public class For_loop {
	public static void main(String[] args) {
		
		// for(initialization;condition;updation){
                //       code 
                //    }
	
		
		// Example of for loop
                // Curly brackets are not mandatory for one statement except for declaretive statement
		for(int a=0, int b=2; a<b; a++,b--)
			System.out.println("Hello");
		
		// Empty Statement
		for(int a=0; a<5; a++); 
		
                // Syntax Error due to multiple typecast for same variable
                // for(int a=0, char='r'; a<4;a++);
                // Invalid syntax for(int a=0, char b="S"; a<=7) we can't declare different datatype.
		
                // for(int a=0; ;a++){
                //     System.out.println("Hello");  // Infinite loop because of skip condition statement
	        //    }
                // System.out.println("reached"); // Hence the loop is infinite it will give compile time error i.e Unreachable code.
		
		//Infinte for loop
		// for(; ;){
		//      System.out.println("Infinite for loop"); 
	        //    }
		
		for(System.out.println("Hello"); i<3; System.out.println("Hello")){
			i++;
		}
		
	}

}
