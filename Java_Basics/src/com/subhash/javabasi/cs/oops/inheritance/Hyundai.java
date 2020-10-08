/**
 * 
 */
package com.subhash.javabasi.cs.oops.inheritance;

/**
 * @author Subhash
 *
 */
public class Hyundai extends Car{

	private String model = "i10"; // private member accessed only by the members of the particular class
	
	public static void main(String[] args) {
		
		Hyundai myCar = new Hyundai();
		myCar.brand();
		
		System.out.println("My car is "+myCar.brand+" "+myCar.model);
		

	}

}
