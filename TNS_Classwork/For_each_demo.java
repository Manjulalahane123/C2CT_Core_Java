package loops_pack;


// For each loop is used to retrive the from iterative objects. e.g Array

class For_each_demo{
  
  public static void main(String[] args){
    
  int arr[] = {2,3, 5, 6}; // Array as been declared with elements
  int num = 0;
  
   // for(each_items (inside variable): target (iterative object) ){
   //    code;
   // }
   
  // Simple example of for each loop
  for(int sub_arr: arr)
    System.out.println("array element at position "+num+"="+sub_arr);
  
 }
}
