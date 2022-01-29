// In this code we will see how methods are overridden for both Object.
public class String_Stringbufferr_method_difference {

	public static void main(String[] args) {
		
		// Creating string object 
		String str_name1 = new String("Siddhant");
		String str_name2 = new String("Siddhant");
		
		// Creating string object 
		StringBuffer L_name1 = new StringBuffer("Nivilkar");
		StringBuffer L_name2 = new StringBuffer("Nivilkar");
		
		// "==" operator with String and StringBuffer object will perform address comparison.
		System.out.print("String object: ");
		System.out.println(str_name1==str_name2);
		System.out.print("StringBuffer object: ");
		System.out.println((L_name1 == L_name2)+"\n");
		
		// .equals() method is overridden for String objects for content compare.
		System.out.println("String object with equals method: "+str_name1.equals(str_name2)+"\n");
		
		// But in case of StringBuffer objects .equals() method is not overridden for content compare.
		System.out.println("String object with equals method: "+L_name1.equals(L_name2));

	}

}
