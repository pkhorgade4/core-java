package StaticEx;

public class StaticBlock {
 static int a;
 static int b;
static {
	int a=10;
	int b=20;
}
public static void main(String[] args) {
	System.out.println("value of a: "+a);
	System.out.println("value of b: "+b);
}
}
