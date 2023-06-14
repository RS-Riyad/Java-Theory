package encapsulation;

public class MyClass{

	public static void main(String[] args)
	{
		Person x= new Person("Juss", 20);
	//	x.setName("Juss");
	//	x.setId(20);
		System.out.println("Name : "+x.getName()+ "; Age : "+x.getId());
	}
}
