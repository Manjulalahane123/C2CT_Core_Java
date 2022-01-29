package prac_abs;

// In this code we have created abstract class constructor and initialized the values in abstract class through Derived class

// Declaring abstract class Base
abstract class Base{
	
	
	// Abstract class constructor.
	Base(String str){
		System.out.println("Abstract class constructor is created"+" and initialized value are "+str);
		
	}
}

// Inheriting abstract class in  Abstract_class_const_demo class.
public class Abstract_class_const_demo extends Base{
	
    // Derived class constructor
	Abstract_class_const_demo(String str2){
		super(str2);
		System.out.println("Derived class constructor");
	}

	public static void main(String[] args) {
		
		// Object creation.
		Abstract_class_const_demo obj1  = new Abstract_class_const_demo("Value passed through Dervied class constructor");
		

	}

}
