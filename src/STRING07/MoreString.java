//**************************************************
// MoreString.java   Author: Nazmul Hasan
// Demonstrates how to use string.
//**************************************************

package STRING07;

public class MoreString {

	public static void main(String[] args) {
		
		//creating a string by java string literal 
		String str = "BEAUTIFUL BANGLADESH"; 
		
		char arrch[]={'W','E','L','L','C','O','M','E'}; 
		
		//converting char array arrch[] to string str2
		String str2 = new String(arrch); 


		String str3 = new String("Bangladesh forms the largest and easternmost part of the Bengal region.");
		String str4 = new String("Bangladeshis include people from a range of ethnic groups and religions.");
		String str5 = new String("Bangalis, who speak the official Bengali language, make up 98% of the population.");
		String str6 = new String("The politically dominant Bengali Muslims make the nation the world's third largest Muslim-major country.");


		//Displaying all the strings
		System.out.println(str);
		System.out.println();

		System.out.println(str2);
		System.out.println();

		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}
}
