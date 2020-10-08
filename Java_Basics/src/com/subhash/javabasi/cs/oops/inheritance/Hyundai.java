/**
 * 
 */
package com.subhash.javabasi.cs.oops.inheritance;

/**
 * @author Subhash
 *
 */
public class Hyundai extends Car{

	public String model = "i10";
	
	public static void main(String[] args) {
		
		Hyundai myCar = new Hyundai();
		myCar.brand();
		
		System.out.println("My car is "+myCar.brand+" "+myCar.model);
		

	}

}
