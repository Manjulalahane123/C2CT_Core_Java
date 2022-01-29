package loops_pack;

// In this code we have shown the use of Break with labeled blocks

class Labeled_block_with_break{
  
  public static void main(String[] args){
    
    Outer: for(int i=0;i<=5;i++){ // Outer for loop
     
      Inner: for(int j=0;j<=i;j++){ // Inner for loop
        
        if (j == 4){
          break Outer;
        }else if(j == 3){
          break Inner;
        }
        
      }
    }
  
  
  }

}
