package encap_xmpl_4;

public class MyClass {

	public static void main(String[] args)
	{
		Employee e1=new Employee("Juss", 5592, 100000.0);
		e1.setId(5592);
		e1.setName("Juss");
		e1.setSalary(100000.0);
		
		System.out.println("Name : " +e1.getName());
		System.out.println("ID : " +e1.getId());
		System.out.println("Salary : " +e1.getSalary());
	}
}
