// In this code we have shown how to achieve method overriding.

// Method overriding is achieved in different class with same method signature.
// To implement methodriding we need inheritances 

class Parent{

  // Same method signature 
  void method(){
     System.out.println("Parent class method");
  }

}

class Child{

  // Same method signature 
  void method(){
     System.out.println("Child class method and overriding is done");
  }

}

public class Demo_Method_Overriding {

	public static void main(String[] args) {
		Child obj = new Child();
    
    obj.method();
    
  }
  
}
