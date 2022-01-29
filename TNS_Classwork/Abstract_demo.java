// In thois code we will see the declaration of abstract class and method and how to implement them.

// To make a abstract class we use abstract keyword which is access modifier
abstract class Abstract_demo_class{
  
  // Inside abstract we just declare the methods
  // An abstract can contain nth number method declaration or not even a single one
  // To declare the abstract method we use abstract keyword
  // Abstract class can also have an instances method
  abstract void m1();
  
  abstract void m2(int num1, int num2);
  
  void m3(){
    System.out.println("Instances method \n " +
                       "we can access this method with help of sub-class");
  }
}

// Note:  We can't create the object of a abstract class 


// To implement the methods of abstract class we need to extend them in another class

class Implement_demo extends Abstract_demo{
  
  void m1(){
    System.out.println("Abstract method m1() body");
  }
  
   void m2(int num1, int num2){
    System.out.println("Abstract method m2() body");
  }
  
  // If we didn't implement all methods declare in abstract class then we have to also declare the class as abstract

}


class Abstract_demo{
  
  public static void main(String args[])
  {
    // Creating the object of Implement_demo class 
    Implement_demo obj2 = new Implement_demo();
    
    // Accessing the methods of implemented methods
    obj.m1();
    obj.m2();
    
    // We can use the reference of abstract class to create objects of other class.
     Abstract_demo_class obj2 = new Implement_demo();
    
  }
}
