package loops_pack;

// break keyword is used to break the on going loops
// It is used in switch, loops and labelled blocks.

class Break_demo{
  
  public static void main(String[] args){
    
    // Without break switch will enter in fall through condition i.e it will execute all case after case no. called.
    int num = 2;
    Switch(num)
    {
      case 2:
      //code
      break;
      
      case 4:
      //code
      break;
    }
    
    // for loop example
    for(int i=1; i>=3; i++){
      if(i == 2)
        break;
      System.out.println("Inside the loop");
    }
    System.out.println("outside the loop");
    
    // while loop example
    int num2 = 3
    while(num2 >= 10){
      if(num2 == 4)
        break;
      System.out.println("Inside the loop"); 
    }
     System.out.println("outside the loop");
    
  }
}
