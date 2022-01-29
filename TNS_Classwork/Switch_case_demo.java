package loops_pack;

// In this code we will see how to use switch cases.

class Switch_case_demo{
  
  public static void main(String[] args){
    int num = 3;
    int x = num
    // Switch accepts only byte, int, short and char datatypes.
    Switch(x){
      // case accepts only constant values and also  math expression which result in constant value
      // case 
      case 1:
        System.out.println("Case 1");
        break;
      
      case 2+3:
         System.out.println("Case 2+3");
         break;
      
      case x:
         System.out.println("Case x");
         break;
      
      case 'A':
         System.out.println("Case A"); // This char data type will be converted into unicode value which is constant value 
         break;
      
      default:
      // It is optional 
      // If any case is not executed in that case this will execute
         System.out.println("Default case");
         break;
      
    }
    
    //Note:  Without break statement switch case will go under fall through condition
  
    Switch(x){
    // Empty switch.
    }
    
    // Fall through error
    Switch(x){
      case 1:
        System.out.println("Case 1");

      case 2:
         System.out.println("Case 2");
    
    }
    
  }

}
