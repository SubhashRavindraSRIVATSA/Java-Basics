/**
 * 
 */
package com.subhash.javabasics.oops.interfac;

/**
 * @author Subhash
 *
 */
public class Cat implements Animal{

	public void animalCall() {
		System.out.println("I am a cat");
	}
	
	public void animalSleep() {
		System.out.println("The cat is sleeping");
	}
	
	public static void main(String[] args) {

		Cat myCat = new Cat();
		myCat.animalCall();
		myCat.animalSleep();

	}

}
