package SimpleConstructor;

public class Hello {
	String name;
	//Constructor
	Hello()
	{
	this.name = "java by kiran";
	}
	public static void main(String[] args) {
	Hello obj = new Hello();
	System.out.println(obj.name);
	}
}
