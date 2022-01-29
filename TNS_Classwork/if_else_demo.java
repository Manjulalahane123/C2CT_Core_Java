package loops_pack;

// In this code we will see how to use if else statement.
class if_else_demo{
    
  public static void main(String[] args){
  
    // Simple if else statement
    int num = 1548;
      
    // Curly braces are not mandatory for one statement except for decalarative statement
    // Error due to declarative 
    // if(true)int x = 100;
      
    // Result of logical statement which is pass after if must be boolean type.
    if(num%2==0) 
      System.out.println("Even number");
    else
      System.out.println("Even number");
    // else is not mandatory 
      
    
    
    // else if
    if(num == 345)
      System.out.println("Yes");
    else if(num == 1548)
      System.out.println("Yes");
    else
      System.out.println("no");
    
    // Nested if else
    if(num == 1548){
      System.out.println("Entered inside if block");
      if(num != 458){
        System.out.println("Entered inside the nested if block");
      }
      else{
        System.out.println("This is assoicated with inner if");
      }
    else{
       System.out.println("This is assoicated with outer if");
    }
      
    }
    
  }

}
