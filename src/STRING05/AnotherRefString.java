//**************************************************
// AnotherRefString.java   Author: Nazmul Hasan
// Demonstrates how to use string.
//**************************************************

package STRING05;

class Name {
	String name;
}

public class AnotherRefString {

	public static void main(String[] args) {
		Name myName = new Name();
		

		Name myCurrentName = myName;
		Name myFormerName = myCurrentName;
		
		myCurrentName.name = "NHRIFAT";

		System.out.println("myName : " + myName.name);
		System.out.println("myCurrentName : " + myCurrentName.name);
		System.out.println("myFormerName : " + myFormerName.name);


		myFormerName.name = "Nazmul Hasan";


		System.out.println("myName : " + myName.name);
		System.out.println("myCurrentName : " + myCurrentName.name);
		System.out.println("myFormerName : " + myFormerName.name);

		myFormerName.name = null;

		System.out.println("myName : " + myName.name);
		System.out.println("myCurrentName : " + myCurrentName.name);
		System.out.println("myFormerName : " + myFormerName.name);

	}
}
