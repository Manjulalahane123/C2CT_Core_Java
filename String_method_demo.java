
class String_method_demo{
  
  public static void maoin(String[] args){
    
    // Declaring String refrence variable with string values.
       String str1="How are you:/n";
       String str2="I am fine ";
		
   // concat() method adds two string objects to produce new String object
   // But in case of immutable i.e StringBuffer it will modify the object
       String str3 = str1.concat(str2);
       System.out.println(str3);
    
   // .equals() method checks whether  two strings objects are same or not and returns boolean o/p.
       System.out.println(str1.equals(str3));
		
   // .contains() methods check a string object data.
       System.out.println(str1.contains("How"));
    
   // .substring() method is used for String slicing. 
       System.out.println(str1.substring(1, 5));
    
   // .startsWith() and .endsWith() method will check the whether the string is starting with the passed string value parameter visa versa and returns boolean value. 
       System.out.println(str1.startsWith("H")+str1.endsWith("\n"));
    
   // .trim() method will eliminate the whitespace from both left and right hand side. 
       System.out.println(str1.trim());
    
   // .split() method will return a split string object based on string value passed as a parameter inside split() and returns a array.
       System.out.println(str1.split("a"));
   
   // .toUpperCase() method will convert the string object to upper case letters. 
       System.out.println(str1.toUpperCase());
    
   // .toLowerCase() method will convert the string object to lower case letters.
       System.out.println(str1.toLowerCase());
   
   // .replace() method will replace the string data based on passed parameter. 
       System.out.println(str1.replace("How", "who"));
    
    // .length() method will return the size of string object
       System.out.println(str1.length());
    
  }
}
