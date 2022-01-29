// In this code we will initialize the values inside the class with help of constructor
public class Const_init_demo {
	String name;
	int roll_no; 
	int r;
	
	// This type of constructors are Parameterized consturctor
	public Const_init_demo(String name, int roll_no) {
		this.name=name;
		this.roll_no=roll_no;
               }
	public static void main(String[] args) {
		// Initiating the values
		Const_init_demo obj1=new Const_init_demo("Siddhant", 03);
		
		// Print the values 
		System.out.println("Constructor as initialized the value"+  ": "+ obj1.name +" "+ obj1.roll_no);
	}

}

