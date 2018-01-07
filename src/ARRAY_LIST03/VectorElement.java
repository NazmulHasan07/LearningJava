//***********************************************************
// VectorElement.java   Author: Nazmul Hasan
// Demonstrates how to use vector element for an array list.
//***********************************************************



package ARRAY_LIST03;

import java.util.*;



public class VectorElement {

	public static void main(String[] args) {
		// Vector of initial capacity(size) of 2 */
		Vector<String> vec = new Vector<String>(2);

		// Adding elements to a vector*/
		vec.addElement("Cricket");
		vec.addElement("Football");
		vec.addElement("Hockey");
		vec.addElement("Baseball");
		vec.addElement("Basketball");
		vec.addElement("Tennis");
		vec.addElement("Golf");


		// Check the size and capacity Increment
		System.out.println("Size is: "+vec.size());
		System.out.println("Default capacity increment is: "+vec.capacity());

		vec.addElement("BOWLING");
		vec.addElement("TENNIS");
		vec.addElement("SWIMMING");
		vec.addElement("CHESSE");


		// Check the size and capacity Increment after two insertions*/
		System.out.println("Size after addition few sports: "+vec.size());
		System.out.println("Updated capacity after increment is: "+vec.capacity());

		// Display the Vector elements
		Enumeration<String> en = vec.elements();
		System.out.println("\nSports Elements are:");
		while(en.hasMoreElements())
			System.out.print(en.nextElement() + " ");
	}
}
