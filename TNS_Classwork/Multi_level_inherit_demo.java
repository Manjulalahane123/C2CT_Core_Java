package Inheritances_pack;

// In this code we will see how to implement multilevel inheritance 

// Craeting GrandParent class which will act as a super class.
class GrandParent{
  
  // Creating instances variable of String.
  String gp_str = "Grand Parent class instances variable";
    
  // Creating no return type method 
   void grand_Method(){
    System.out.println("Grand Method");
  }
}

// Craeting Parent class which will act as a sub-class of GrandParent class.
class Parent extends Grand_Parent{
  
  // Creating instances variable of String.
  String p_str = "Parent class instances variable";
    
  // Creating no return type method 
   void parent_Method(){
    System.out.println("Parent Method");
  }
}

// Craeting Child class which will act as a sub-class of Parent class.
class Child extends Grand_Parent{
  
  // Creating instances variable of String.
  String c_str = "Child class instances variable";
    
  // Creating no return type method 
   void child_Method(){
    System.out.println("Child Method");
  }
}


public class Multi_level_inherit_demo {

	public static void main(String[] args) {
  
  // Creating object of Child class
    Child obj1 = new Child();
    
  // Access the Data members and properties of GrandParent and Parent class through Child class object
    obj1.gp_str;
    obj1.p_str;
    
    obj1.grand_Method();
    obj1.parent_Method();
    
 // Through Parent class object we can also access Grand
    Parent obj2 = new Parent(); //Object of Parent class.
    
    obj2.gp_str;
    obj2.grand_Method();

 // Note:  We can only access the Data Members and property of super class only through subclass. 

  }
}
