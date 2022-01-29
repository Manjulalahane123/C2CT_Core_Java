import java.util.Scanner;

class Area_methods{
	float pi = 3.14f; // Instances variable
	
	float area_of_circle(float radius) {
		return pi*radius*radius;
	}
	
	int rectangle(int l, int b) {
		return l*b;
	}
	
	float area_of_square(int s){
		return s*s;
	}
}




public class Area_method {
	public static void main(String[] args) {
		Area_methods obj = new Area_methods(); // Object create of class Area_methods
		Scanner user_input = new Scanner(System.in); // Scanner class object
		System.out.println("Welcome to the java area calculator\n ");
		
		while (true) {
			System.out.println( "\nSelect options from below by entering the option number\n"
					+ "1.Calculate the Area of Circle\n"
					+ "2.Calculate the Area of rectange\n"
					+ "3.Calculate the Area of Square\n"
					+ "Enter 0 to exit\n");
			System.out.println("Enter the Option number: ");
			int num = user_input.nextInt();
			if (num==1) {
				System.out.println("Enter the radius of cicrle: ");
				int num1 = user_input.nextInt();
				System.out.println("Area of Circle: "+obj.area_of_circle(num1)+" m.sq");
				continue;
				}
			else if(num==2) {
				System.out.println("Enter the length and breadth of rectangle : ");
				System.out.println("Enter the length of rectangle : ");
				int num1 = user_input.nextInt();
				System.out.println("Enter the breadth of rectangle : ");
				int num2 = user_input.nextInt();
				System.out.println("Area of Rectangle: "+obj.rectangle(num1, num2)+" m.sq");
				continue;
			}
			else if(num==3){
				System.out.println("Enter the side of square: ");
				int num1 = user_input.nextInt();
				System.out.println("Area of square: "+obj.area_of_square(num1)+" m.sq");
				continue;
				}
			else {
				System.out.println("Thank you");
				break;	
			}
			
		}user_input.close();
	}
	

}
