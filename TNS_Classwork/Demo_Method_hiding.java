// In this code we have shown that how to achieve method hiding in java

// Method hiding in java  is achieve through static method 

// Creating a parent class with static method
class Parent{
  
  static void m1(){
    System.out.println("Parent class method");
  }

}

// Creating a Child class with static method
class Child extends Parent{

  static void m1(){
    System.out.println("Child class method");
  }
}



class Demo_Method_hiding{
  
  public static void main(String args[]){
    
    // Static methods in java can be invoke directly by its name when it is in its own class 
    // And by Class_Name.static method in its own class and in another class.
    // We can't override a static method.
    
    // Through Method hiding we can't invoke the static method directly we need the object of that class or by Class_Name.static_method.
    
    Parent obj1 = new Parent();
    Child obj2 = new Child();
    
    // m1() .... compile time error.
    obj1.m1()
    obj2.m1()
    
  
  }
}
