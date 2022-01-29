// In this code we will see the behaviour of + operator between String object and signed data types.

class String_concatenation_demo{
  
  public static void main(String[] args) {
    
    // Declaring local variable with int data type
    int num1=20;
    int num2=45;
    int num2=55;
    
    // Creating String object.
    String str = "Siddhant";
    
    
    // "+" operator will perform addition operation if it is declare between two signed data types
    // if "+" operator is declare between the signed and unsigned or between unsigned and unisigned data types it will perform concatenation.
    
    System.out.println(num1+num2+str+num3); // 65Siddhant55
    System.out.println(str+num1+num2+num3); // Siddhant204555
    System.out.println(num1+num2+num3+str); // 120Siddhant
    
    
  
  }
}
