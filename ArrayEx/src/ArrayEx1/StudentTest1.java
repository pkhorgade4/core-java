package ArrayEx1;

public class StudentTest1 {
public static void main(String[] args) {
	
	Student1[] ss=new Student1[8];
	
	Student1 s=new Student1(11,"mayu",new Phone1(45632,98453));
	Student1 s1=new Student1(12,"piyu",new Phone1(45632,98453));
	Student1 s2=new Student1(13,"priya",new Phone1(45632,98453));
	Student1 s3=new Student1(14,"komal",new Phone1(45632,98453));
	Student1 s4=new Student1(15,"sagar",new Phone1(45632,98453));
	Student1 s5=new Student1(16,"priyanka",new Phone1(45632,98453));
	Student1 s6=new Student1(17,"nayan",new Phone1(45632,98453));
	Student1 s7=new Student1(18,"saylee",new Phone1(45632,98453));
	
	
	
	
	ss[0]=s;
	ss[1]=s1;
	ss[2]=s2;
	ss[3]=s3;
	ss[4]=s4;
	ss[5]=s5;
	ss[6]=s6;
	ss[7]=s7;
	
for (Student1 student : ss) {
		
		System.out.println("Id>>"+student.id);
		System.out.println("Name>>"+student.name);
		System.out.println("LandLine>>"+student.phone.Landline);
		System.out.println("Mobno>>"+student.phone.Mobno); 
	    System.out.println("-------------------------------");
		}
	}
}
