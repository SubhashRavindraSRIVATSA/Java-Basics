package com.subhash.javabasics.strings;

public class StringOps {

	public static void main(String[] args) {

		String s1 = "Mediterranean";
		String s2 = "Sea";
		
		System.out.println("String s1 is :"+s1+"\nString s2 is : "+s2);
		
		String con = s1.concat(s2);		// Using concat method
		System.out.println("\nResult using concat method : "+con);
		
		System.out.println("Result using + operator : "+(s1+s2)); 	// Using + operator
		
		String s3 = "Royal Challengers Bangalore";		
		System.out.println("The INPUT String  s3 is : "+s3);
		
		System.out.println("The Length of the string s3 is : "+s3.length());	// Length of a given string
		
		System.out.println("\nThe character at position 7 in string s3 is : "+s3.charAt(7));	//character at position
		System.out.println("Letter 'B' is located at "+s3.indexOf('B')+"th position in s3"); // Index of character
		
		int cmp1 = s1.compareTo(s2);											// comparing 2 strings using compareTo method
		if(cmp1 == 0) {
			System.out.println("\n"+s1+" is the same string as "+s2);
		}
		else
			System.out.println("\n"+s1+" is the NOT the same string as "+s2);
		
		String s4 = "mediteRRanEAn";
		System.out.println("\n"+"String s1 is : "+s1+"\nString s4 is : "+s4);
		
		int cmp2 = s1.compareToIgnoreCase(s4);									// comparing 2 strings using compareToIgnoreCase method
		if(cmp2 == 0) {
			System.out.println("\n"+s1+" is the same string as "+s4);
		}
		else
			System.out.println("\n"+s1+" is the NOT the same string as "+s4);
		
		System.out.println("\n"+s3+" contains the sequence 'Bangalore' : "+s3.contains("Bangalore")); // contains the sequence
		
		System.out.println("\n"+s3+" end with a character e : "+s3.endsWith("e"));		// ends with the character or a sequence
		
		System.out.println("\n"+s3+" in Upper case is "+s3.toUpperCase());	// to upper case		
		System.out.println(s3+" in Lower case is "+s3.toLowerCase());		// to lower case
		
		
		
		
		
		
		
	}

}
