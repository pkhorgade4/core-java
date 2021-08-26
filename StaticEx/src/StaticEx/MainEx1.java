package StaticEx;

import StaticEx.OuterClassEx1.InnerClass;

public class MainEx1 {
	
	// How to create instance of static and non static nested class?
	public static void main(String args[]){
	// create instance of nested Static class
	OuterClassEx1.NestedStaticClass printer = new OuterClassEx1.NestedStaticClass();
	// call non static method of nested static class
	printer.printMessage();
	// In order to create instance of Inner class we need an Outer class
	// instance. Let us create Outer class instance for creating
	// non-static nested class
	OuterClassEx1 outer = new OuterClassEx1();
	OuterClassEx1.InnerClass inner = outer.new InnerClass();
	// calling non-static method of Inner class
	inner.display();
	// we can also combine above steps in one step to create instance of
	// Inner class
	OuterClassEx1.InnerClass innerObject = new OuterClassEx1().new InnerClass();
	// similarly we can now call Inner class method
	innerObject.display();
	}
	}
