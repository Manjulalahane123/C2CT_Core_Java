// In this code we will see have to create Tnterface and have to implement them in other classes

// In java we use interface to achieve total abstraction
// With the help of interface we can achieve multiple inheritances

// To create a Interface in java we need to declare it with interface keyword

interface Details_demo{
  // An interface can have nth number of method declaration.
  // Same as abstraction we can't create the object of interface
  // Inside interface we by default all the methods are abstract.
  // Interface can't have normal methods.
  
  // Method declaration 
  void m1();
  void m2();
  
}

interface demo_2{
  
  void m3();
}


// To use interface we inherit them with implements keyword
// Example of multiple inheritances
class Interface_demo implements Details_demo, demo_2{
  
  public void m1(){
    System.out.println("Interface method body")
  }
  
   public void m2(){
    System.out.println("Interface method body")
  }
  
   public void m3(){
    System.out.println("Secnod Interface method body")
  }
  
  
  public static void main(String[] args) {
    
    // Object creation of Interface_demo class.
    Interface_demo obj = new Interface_demo();
   
    obj.m1();
    obj.m2();
    obj.m3();
  }
}
  
