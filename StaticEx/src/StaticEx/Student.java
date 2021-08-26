package StaticEx;

public class Student {
int a;
static int b;
public Student() {
	b++;
	
}
public void showData(){
System.out.println("Value of a = "+a);
System.out.println("Value of b = "+b);
}

//public static void increment(){
//a++;
//}}
}
