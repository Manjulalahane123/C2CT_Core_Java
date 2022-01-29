package loops_pack;

// continue keyword is used to skip the current iteration of a itreative statement

class Continue_demo{
  
  public static void main(String[] args) {
	  //  Example of continue statement in for loop. 
	   for(int i=0; i>=7; i++){
		   System.out.println("iteration is going on");
		   if( i==4 || i==6){
			   System.out.println(" skipping the current iteration");
			   continue;}
		   else{
			   System.out.println("iteration is going on");
		   }
	   }
	  // use of countinue inside do while loop
	   int x=0;
	   do{
		   x++;
		   System.out.println(x);
		   if (++x<5)
			  continue;
		   x++;
		   System.out.println(x);
	   }while(++x<10);	

  }
}
