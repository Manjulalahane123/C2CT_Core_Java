// In this code we will how to create 3D array and how to access its elements
class Array_3D {

    public static void main(String[] args){
    
    // Declaring 3D array with new keyword
    int arr1 = new int[3][][]; // Base size is 3
      
    // Decalring and initializing 3D array. 
    int [][][] arr2 = {{{4,5,8},{54}, {}, {4,5}, {5,8,5}}}; // Declaring the 3D array and inserting the element directly
		// For each loop to access the elements of 3D array
		for(int[][] x1: arr2) // for each loop to access 2D array
		{for(int[] x2: x1) {
			System.out.println(x2.length); //length keyword to return the size of array
		}
     
    // Inserting value with the help of for loop
    int arr5 [][][] = new int[3][][]; // Declareing the base size of 3D array
		arr5[0] = new int[2][]; // Declareing the base size of 2D array 
		arr5[0][0] = new int[4]; // Declareing the base size of 1D array
		for(int x1=0, y=4; x1<arr5[0][0].length;x1++, y++)
		{
			arr5[0][0][x1] = y;
		}
			
		for(int x1: arr5[0][0])
		{
			System.out.println(x1);
		}
		
    System.out.println("===================3D Array declare and length initialization=======================|");
		int arr3 [][][] = new int[2][][];
		arr3[0] = new int[3][];
		arr3[0][0] = new int[2];
		arr3[0][1] = new int[2];
		arr3[0][2] = new int[2];
		
		arr3[1] = new int[2][];
		arr3[1][0] = new int[1];
		arr3[1][1] =new int[1];
		System.out.println("=================Inserting elements(value) in 3D array with for loop================|");
		for(int i=0;i<arr3.length;i++) {
			for(int j=0; j<arr3[i].length;j++) {
				for(int k=0; k<arr3[i][j].length;k++) {
					arr6[i][j][k] = j+i;
					
				}
			}
		}
		System.out.println("====================================================================================|");
		System.out.println("====Print elements of 3D array with for each loop===================================|");
		for(int [][]x1: arr3) {
			System.out.println("Array 3D");
			for(int []x2: x1) {
				System.out.println("Array 2D");
				for(int x3: x2) {
					System.out.println(x3);
				}
			}
		}
		
		
	}
		
    
    }
}
