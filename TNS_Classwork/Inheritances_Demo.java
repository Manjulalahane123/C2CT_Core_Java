package Inheritances_pack;

// In java Inheritances is technique where one class can access another class Data member and method.
// In java inheritances is achieve by extends keyword.

// Creating a Parent class with two properties
// As we are going to inherit the Parent class in Child class, then Parent class is called the super class of Child class
class Parent{
  
  // Declaring String instances variable with String object
  String str = "Parent class Instance variable";
  
  // No return type method 
  void method1_P(){
    System.out.println("Parent class method");
  }
  
  
  // No return type method 
  void method2_P(){
    System.out.println("Parent class method");
  }
  
}

// Creating a Child class with two properties and inheriting the Parent class. 
// Child class is called as subclass of Parent class.
class Child extends Parent{
  
  // No return type method 
  void method1_C(){
    System.out.println("Child class method");
  }
  
  // No return type method 
  void method2_C(){
    super.method2_P(); // super keyword is to invoke the superclass datamember and properties from subclass
    System.out.println("Child class method");
  }
  
}

class nheritances_Demo{
  
  public static void main(String[] args){
    
    // Creating the object of child class 
    Child obj = new Child();
    
    // Access Data member of superclass i.e Parent class with the help of child class object
    System.out.println(obj.str);
    
    // Access Parent class methods through Child object
    obj. method1_P();
    obj. method2_P();
    
    // Note: We can't access the properties of sub-class through superclass objects.
    
    
    
  
  }

}
