class Try_catch_demo{
  
  public static void main(String[] args){
  
    // Try is used to write the risky code which can lead to exception
    // Try should be followed by catch or finally block
    
    try{
      // Risky code
      int num = 5/0;
    }catch(ArithmeticException e){
    // Through catch we are passing Exception object 
    // Exception object consists  location, Description and Name if Exception 
    // Inside catch scope we write the handler code which handles the exception 
      System.out.println(e.getmessage);
    // getmessage() method will print the message of the Exception.
    // Exceptiion is handled by Specify class 
    }
  try
  {
    int arr[] = new int[3] // Decalaring the Array
    arr[3] = 6;
  }catch(Exception e){
    // Exception is handle by Generic class
    // Exception is the sub-class of Throwable class 
    System.out.println(e.getmessage);
  }



}
}
