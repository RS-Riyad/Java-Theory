package encap_xmpl_4;

public class Employee {

	private String name;
	private int id;
	private double salary;
	
	
	public Employee(String n, int i, double s) {
		name=n;
		id=i;
		salary=s;
	}

	public void setName(String n)
	{
		name=n;
	}
	
	public void setId(int i)
	{
		id=i;
	}
	
	public void setSalary(double s)
	{
		salary=s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public double getSalary()
	{
		return salary;
	}
}
