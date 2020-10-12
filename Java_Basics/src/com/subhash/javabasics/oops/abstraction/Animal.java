/**
 * 
 */
package com.subhash.javabasics.oops.abstraction;

/**
 * @author Subhash
 *
 */
abstract class Animal {							// Abstract class

	public abstract void animalCall();			// Abstract method
	
	public void call() {						// Normal method
		System.out.println("I am an animal");
	}
	

}
