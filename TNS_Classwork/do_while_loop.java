package loops_pack;

// In this code we will see how to use do while loop.

class do_while_loop{
    public static void main(String[] args){
    // do while statement will run loop by default one time and then it check the while condition
    int num = 2;
    do{
	    num++;
            System.out.println(num);
    }while(num>=5);
    
    int x=0;
	   do{
		   x++;
		   System.out.println(x);
		   if (++x<5)
			  continue;
		   x++;
		   System.out.println(x);
	   }while(++x<10);
      
   // Empty do while loop
    do;
    while(false);
   
   // Infinite loop
   // do{
   //    int a = 1
   //   }while(true);
    
    }
}
