package jbk.Array;

public class IntArray {
public static void main(String[] args) {
	int array[]= new int [3];
	array[0]=1;
	array[1]=10;
	array[2]=100;
	
	for (int i = 0; i < array.length; i++) {
		int value=array[i];
		
		System.out.println(value);
	}
	
}
}
