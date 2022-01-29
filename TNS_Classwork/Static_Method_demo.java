class Static_Method_demo{

  static void method_1(){
      System.out.println("Static Method")
  }

  public static void main(String[] args){
    // Static method does not requried object to invoke itself in it's own class
    
    // Static method can be directly call
    method_1();
    
    // OR My class name
    Static_Method_demo.method_1();
    
  }
}
