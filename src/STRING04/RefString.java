//**************************************************
// RefString.java   Author: Nazmul Hasan
// Demonstrates how to use string.
//**************************************************


package STRING04;

public class RefString {

	public static void main(String[] args) {
		String s1 = new String("Dramatically");
		String r1 = s1;
		System.out.println("Value of s1 : " + s1);
		System.out.println("Value of r1 : " + r1);

		System.out.println("The object s1 is located at: " + System.identityHashCode(s1));
		System.out.println("The reference r1 is located at: " + System.identityHashCode(r1));

		r1 = null;

		System.out.println("Value of s1 : " + s1);
		System.out.println("Value of r1 : " + r1);

		System.out.println("The object r1 is located at: " + System.identityHashCode(r1));
		System.out.println("The reference s1 is located at: " + System.identityHashCode(s1));

	}
}
