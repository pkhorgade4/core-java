package StaticEx;

public class MyStaticMethod {
 private String name="mayu";
 private static String str="piyu";
 
 
public MyStaticMethod(String string) {
	// TODO Auto-generated constructor stub
}
public void MyStaticMethod1 (String n) {
	 this.name=n;
 }
 public  static  void testStaticMethod() {
	 System.out.println("hiiii....... i am a static method"); 
	 System.out.println(MyStaticMethod.str);
 }
	 public void testObjectMethod() {
		 System.out.println("Hey i am in non-static method");
		 System.out.println(MyStaticMethod.str);
		 System.out.println("Name :" + this.name);
	 }
 public static void main(String[] args) {
	 MyStaticMethod.testStaticMethod();
	 MyStaticMethod msm = new MyStaticMethod ("Java2novice");
	 msm.testObjectMethod();
}
 
}
