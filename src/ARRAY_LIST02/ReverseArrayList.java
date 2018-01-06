//*******************************************************
// ReverseArrayList.java   Author: Nazmul Hasan
// Demonstrates how to reverse array for an array list.
//*******************************************************



package ARRAY_LIST02;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AUSTRALIA");
		list.add("BANGLADESH");
		list.add("CANADA");
		list.add("DENMARK");
		list.add("ENGLAND");
		list.add("FRANCE");
		list.add("GHANA");
		list.add("HUNGERY");
		list.add("IRELAND");
		list.add("JAPAN");
		list.add("KENYA");
		list.add("LEBANON");
		list.add("MALAYSIA");
		list.add("NEW ZEALAND");
		list.add("OMAN");
		list.add("PERU");
		list.add("QATAR");
		list.add("RUSSIA");
		list.add("SAUDI ARABIA");
		list.add("THAILAND");
		list.add("USA");
		list.add("VENEZUELA");
		list.add("YEMEN");
		list.add("ZIMBABWE");

		Collections.reverse(list);
		System.out.println("Country Name After Reverse Orderly:");
		System.out.println();
		for(String str: list){
			System.out.println(str);
		}
	}
}