// In this code we have created Compiled time i.e Checked Exception with the help of throw and throws keyword.
package Exception_demo;
// Importing Scanner class to take user input
import java.util.Scanner;


// Note: To create Cheched exception we need to extend Exception class 
// Creating user defined exception 
class Invalid_Input_AgeException extends Exception{
	
	// Creating Constructor to initiate the custom message.
	Invalid_Input_AgeException(String msg){
		super(msg);
	}
}



public class Custom_Checked_Execption {
	
	// Throws keyword tells the caller of the method that this method can throw exception 
	// you should use try catch block
	public void VotingAge(int age) throws Invalid_Input_AgeException {
		if(age>=18) {
		  System.out.println("You are eligible for voting"); 
		}else {
			// Throw keyword is used to throw Exception directly based on programmer logic
			throw new Invalid_Input_AgeException("You are not eligible");
			// We can also pass the message 
		}
	}

	public static void main(String[] args) {
		Custom_Checked_Execption obj = new Custom_Checked_Execption();
		try {
			obj.VotingAge(0);
		}catch (Invalid_Input_AgeException e) {
			e.getMessage();
		}

	}
	
	

}
