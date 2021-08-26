package jbk.Array;

public class FindEvenNo {
	public static void main(String[] args) {
		
  int a[]=new int[5];
  a[0]=3;
  a[1]=5;
  a[2]=4;
  a[3]=7;
  a[4]=8;
  System.out.println("odd numbers");
  for (int i = 0; i < a.length; i++) {
  
  if(a[i]%2!=0) {
	  System.out.println(a[i]);
  }
  }
	System.out.println("Even numbers");
	  for (int i = 0; i < a.length; i++) {
	  
	  if(a[i]%2==0) {
		  System.out.println(a[i]);
	  }
	  }
	}
}
	
	

