// In this code we will see the properties of String and BufferString.
public class String_bufferString_demo {

	public static void main(String[] args) {
		
		// String declaration and initialization with new keyword, i.e.. Object.
		String str1 = new String("Siddhant");
		
		// String declaration without new keyword
		// Strings are mutable object i.e we can't modify the object that we have created.
		String StrName = "Siddhant Nivilkar";
		
		System.out.println(str1);
		
		
		// Concatenating string object with concat() method and saving in new variable
		String str3 = str1.concat(" Nivilkar");
		
		// String declaration and initialization the mutable string object 
		// StringBuffer are immutable.
		StringBuffer str2 = new StringBuffer("Hey there ");
		
		// With the help of the append method we can add strings to stringBuffer objects.
		str2.append("Buddy");
		System.out.println(str3+"\n"+StrName);
		
		int num = 3, num2 = 4;
		byte num3 = 23;
		String new_str = str3 + num +num2 + num3 ;
		String_demo obj = new String_demo();
		String new_str1 = StrName.toUpperCase();
		System.out.println(new_str1+" "+new_str);
		String str6 = "Si";
		String str7 = "Siddhant";
		System.out.println(str7.equals(str6));
		String str8 = str6.replace("i", "I");
		System.out.println(str7.substring(2,8));
		
		
	}
}
