package StaticEx;

public class VariableDemo {
static int count=10;
 public void increment() {
	 count++;
 }
 public static void main(String[] args) {
	 VariableDemo cc= new VariableDemo();
	 VariableDemo cc1= new VariableDemo();
	 cc.increment();
	 cc1.increment();
	System.out.println("cc: count is="+cc.count);
	System.out.println("cc1: count is="+cc1.count);
	
}
 
}
