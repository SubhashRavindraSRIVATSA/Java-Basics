package com.subhash.javabasics;


class OuterClass{
	int x=10;
	
	class InnerClass{	// Inner class nested within Outer class
		int y = 5;
	}
	/*static class InnerClass{	// Inner class nested within Outer class declared as static
		int y = 5;
	}*/
}


public class InnerOuterClass {

	public static void main(String[] args) {

		OuterClass myOuter = new OuterClass();						// Outer class object
		OuterClass.InnerClass myInner = myOuter.new InnerClass();	// Inner class object 
		
		//OuterClass.InnerClass myInner = new OuterClass.InnerClass();	// Static Inner class object
		
		int c = myOuter.x+myInner.y;
		System.out.println(c);

	}

}
