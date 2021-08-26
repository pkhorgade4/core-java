package CopyConstructor;

public class JavaExample {
	String web;
	JavaExample(String w){
	web = w;
	}
JavaExample(JavaExample je){
web = je.web;
}
void disp(){
System.out.println("Website: "+web);
}
public static void main(String args[]){
JavaExample obj1 = new JavaExample("www.javabykiran.com");
JavaExample obj2 = new JavaExample(obj1);
obj1.disp();
obj2.disp();
}
}
