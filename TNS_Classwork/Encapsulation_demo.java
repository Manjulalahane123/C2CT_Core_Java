class Encapsulation_demo{
  
  String str = "Instances variable"
  private int num;
  
  void method_1(){
     System.out.println("E.g.. Classes, Abstraction etc..")
  }
  
  
  public static void main(String args[]){
    
    System.out.println("Encapsulation is the method of binding data with methods");
    
    // Creating the object
    Encapsulation_demo obj = new Encapsulation_demo();
    
    obj.method_1();
  }
}
