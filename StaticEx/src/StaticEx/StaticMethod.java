package StaticEx;

public class StaticMethod {
public  static void copyArg(String str1,String str2) {
	str2 = str1 ;
	System.out.println("first String is "+str1);
	System.out.println("second String is "+str2);
	
}
public static void main(String[] args) {
	StaticMethod.copyArg("piyu","mayu");
	StaticMethod.copyArg("ABC","XYZ");
	
}
}
