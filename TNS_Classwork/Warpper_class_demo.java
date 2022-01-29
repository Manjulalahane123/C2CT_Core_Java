// In this code we will see how wrapper class objects are created
// what is Autoboxing and Unboxing

public class Warpper_class_demo {

	public static void main(String[] args) {
		
		// Declaring a reference variable of int data type
		int num1 = 5; // Primitive data type.
		
	  
		// Converting int to Integer object i.e object of wrapper class
		Integer int_obj1 = new Integer(5); // Generic way of converting primitive to wrapper class object.
		
		System.out.println("Primitive data type: "+num1+"\nWrapper class Integer object: "+int_obj1);
		
		//Autoboxing: Automate conversion of primitive to wrapper class object
		Integer int_obj2 = 4; 
		System.out.println("\nWrapper class Integer object: "+int_obj1+"\nChecking the class orgin: "+int_obj1.getClass()+"\n");
		
		//Unboxing: Automate conversion of wrapper class object to there primitive data types
		int num2 = int_obj2;
		System.out.println("Primitive data type: "+num2+"\n");
		
		//Proof of Wrapper class object
		   // num1.(Not even a single method is applicable), because these are references.
		   System.out.println(int_obj1.toString().getClass()+"\n");
		
		
       // Similar we can create all possible wrapper class objects of primitive data types.
	   
	   // For Boolean wrapper object except True,TRUE and true all passed data are false.
		 Boolean bool_obj1 = new Boolean("TRUE");
		 Boolean bool_obj2 = new Boolean(true);
		 Boolean bool_obj3 = new Boolean("true");
		 Boolean bool_obj4 = new Boolean("No");
		 Boolean bool_obj5 = new Boolean("Siddhant");
		 System.out.println(bool_obj1+"\n"+bool_obj2+"\n"+bool_obj3+"\n"+bool_obj4+"\n"+bool_obj5);
	   
	  // Note: We can pass strings as an args to wrapper object 
	  // Float wrapper class objects
		 Float float_obj = new Float("18.6f");
		 System.out.println("Float object float_obj:  " + float_obj);
		 
	  // double wrapper class objects
		 Double double_obj = new Double(250.55d);
		 System.out.println("Double object double_obj:  " + double_obj);
		 
      
	}

}
