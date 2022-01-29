// In this code we see how to create 2D array and how to access its elements

class Array_2D{
	
  public static void main(String[] args) {
	  
    //Declaring the 2d array with new keyword
    int [][] arr_2d_1 = int[3][]; // Base size is 3
	  
    // inserting the size for 1D array of 2D array
    arr_2d_1[0] = new int[2]; // arr_2d_1[0] = {0, 0}
    arr_2d_1[1] = new int[3];  // arr_2d_1[1] = {0, 0, 0}
    arr_2d_1[2] = new int[2];  // arr_2d_1[2] = {0, 0}
    
    // Declaring the 2d array without new keyword
    int [][] arr_2d_2 = {{2,5,6}, {3,4}, {5}, {6,5}};
    System.out.println("This syntax will print the memory location of array i.e x"+"\n"+"x--->"+arr3);
    System.out.println("This syntax will print the memory location of array store in index 0 of 2D array i.e x[0]"+"\n"+"x[0]--->"+arr3[0]);
    System.out.println("This syntax will print the value store of array index 0 that array the value store in index 1  i.e x[0][0]"+"\n"+"x--->"+arr3[0][2]+"\n");
		
    for(int[][] x1: x){ // for each loop to retrive  2D array elements
	 for(int[] x2: x1) {
	      System.out.println(x2); //length keyword to return the size of array
	   }
       }
  }
}
