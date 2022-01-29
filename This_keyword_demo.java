// In this program we will see what is the use of this keyword in java

class This_keyword_demo{
  // Declaring Instances refrence variable of int data type.
  int num;
  
  // Declaring string.
  String str;
  
  // Constructor
  This_keyword_demo(int num, String str){
    
    // When we declare passed variable names same as instance variables.
    // In such cases compiler get confuse which are class variables and which are passed variables.
    // In cases we use this keyword.
    // this keyword is used to indicate compiler which are instances variable and which are passed variable
  
    this.num = num;
    this.str = str;
  }
  
  public static void main(String[] args) {
    
    This_keyword_demo obj = new This_keyword_demo(32, "Siddhant");
    
    System.out.println("Student_name: "+obj.str+" Roll_no: "+obj.num);
    
  }
}
