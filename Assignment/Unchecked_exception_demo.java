// In this code we have created RuntimeException i.e unchecked exception which checked during runtime 
package Exception_demo;
// Importing Scanner class to take user input
import java.util.Scanner;

// To create Custom Unchecked Exception we need to  extend RuntimeException class which is the sub-class of Exception class
// Extending RuntimeException which is sub-class of Exception class
class InvalidEntryException extends RuntimeException{
       // Creating the constructor to initiate the custom message
	InvalidEntryException(String msg){
		super(msg);
	}
}

class Unchecked_demo2{
	
	 // Exception inside a method
	void valid_age(int n) {
		if(n>18) {
		System.out.println("You can entry the water ride");
	        }else {
		throw new InvalidEntry("You are underage");
	       }
       }
	
 }

public class Unchecked_exception_demo {
	
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		int num = 0;
		while(true) {
			try {
			    System.out.println("Enter your age");
			    num = user_input.nextInt();
			}catch (InputMismatchException e  ){
			       System.out.println(e);
			}
			try {
				if(num > 18) {
					System.out.println("You can entry the water ride");
					break;
				}else {
					throw new InvalidEntryException("You are underage");
				}
		        }catch (InvalidEntryException e) {
			       e.getMessage();	
		               }

	                }System.out.println("Out of the loop\n");
		
		
	              
	              Unchecked_demo2 obj = new Unchecked_demo2();
	              try {
	                   obj.valid_age(num);
	              }catch (InvalidEntryException e) {
		           e.getMessage();	
	              }
	              System.out.println("Execption with method");
                      user_input.close();
                      }
                }

