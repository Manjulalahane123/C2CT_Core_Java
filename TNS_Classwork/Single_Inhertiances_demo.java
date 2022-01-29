package Inheritances_pack;

// In this code we will see the types of inheritances.

// Single inheritances

class Base{
  
  // Declaring the instances variable of string datatype.
  String B_str = "Base class data member ";
  
}

class Derived extends Base{
  
  // Declaring the instances variable of string datatype.
  String D_str = "Derived class data member";

}

class Single_Inhertiances_demo{
  
  public static void main(String[] args) {
    
    //Creating the Derived class object
    Derived obj = new Derived();
   
    //Access the data memeber of superclass through subclass object
    obj.B_str;
    obj.D_str;
   
  }

}
