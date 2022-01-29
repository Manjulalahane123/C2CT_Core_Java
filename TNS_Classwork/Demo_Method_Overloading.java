// In this code we have shown have method overloading is done

// Method overloading is achieved in same class with same method name but with different method signature.
// To implement methodriding we need inheritances 

class Overloading_demo{
	
  // Declaring same methods with different method signature.
	public void method(int num1){
		System.out.println("Method 1");
	}
	
	public void method(String s) {
		System.out.println("Method 2");
	}
	
	public void method(int num1, int num2) {
		System.out.println("method 3");
	}
	
	 static void method() {
		System.out.println("Parent class static  method");
	}
	 void method2() {
			System.out.println("Parent method");
		}
	
}
class Demo_Method_Overloading{
  
  public static void main(String[] args) {
    // Creating Overloading_demo object 
		Overloading_demo obj = new Overloading_demo();
    
		obj.method((byte) 2.0);
		obj.method("S");
		obj.method(2,4);
  
  }
}
