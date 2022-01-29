package Inheritances_pack;

// In this code we will see how hierarchical inheritances is implemented in java
// In hierarchical inheritances classes extends same Parent class 
// And they will we able to only inherit the its Parent class properties

// Creating Parent class which will act as a super class
class Parent{
  
  // Declaring Instance variable with String datatype
  String p_str = "Instance variable of Parent class";
  
}

// Creating the sub classes which will extend Parent class
class Child_1 extends Parent{
  
  // Declaring Instance variable with String datatype
  String c1_str = "Instance variable of Child_1 class";
  
}

class Child_2 extends Parent{
  
  // Declaring Instance variable with String datatype
  String c2_str = "Instance variable of Child_2 class";
  
}

class Child_3 extends Parent{
  
  // Declaring Instance variable with String datatype
  String c2_str = "Instance variable of Child_1 class";
  
}

public class Hierarchical_inheritances_demo {

	public static void main(String[] args) {
  
  // Creating objects of Child_1 class, Child_2 class and Child_3 class, 
    Child_1 obj1 = new Child_1();
    Child_2 obj2 = new Child_2();
    Child_3 obj3 = new Child_3();
    
  // Access the Data members and properties of super class through sub-class object
    obj1.p_str;
    obj2.p_str;
    obj3.p_str;
  
 // Note: We can only access the super class properties through its sub class.
  }
}
