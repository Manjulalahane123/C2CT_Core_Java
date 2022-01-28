import java.util.Scanner;
public class Prime_num {

	public static void main(String[] args) {
		int user_num, count=0;
		Scanner user_input  = new Scanner(System.in);
		System.out.println("Please enter a number ");
		user_num = user_input.nextInt();
		for(int i=2;i!=(user_num+1);i++) {
			if(user_num%i==0)
			{
				count++;
			}
		}
		if(count == 1 && user_num!=1)
			System.out.println(user_num+" is a prime");
		else
			System.out.println(user_num+" is not prime");
		user_input.close();
	}

}
