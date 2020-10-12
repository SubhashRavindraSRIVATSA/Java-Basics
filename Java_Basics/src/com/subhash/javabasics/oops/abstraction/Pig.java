/**
 * 
 */
package com.subhash.javabasics.oops.abstraction;

/**
 * @author Subhash
 *
 */
public class Pig extends Animal{

	public void animalCall() {							// Method in derived class
		System.out.println("I am a child class - PIG");
	}
	public static void main(String[] args) {

		Pig myPig = new Pig();							// Object of derived class
		myPig.animalCall();								// Method of derived class PIG
		myPig.call();									// Calling the normal method of Parnt class ANIMAL

	}

}
