/**
 * 
 */
package com.subhash.javabasics.oops.polymorphism;

/**
 * @author Subhash
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Animal myAnimal = new Animal();	// Animal Object
		Animal myCat = new Cat();		// Cat Object
		Animal myDog = new Dog();		// Dog Object 
		
		myAnimal.animalCall();	
		myCat.animalCall();
		myDog.animalCall();
	}

}
