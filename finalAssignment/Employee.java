package finalAssignment;

public class Employee {
	private int employeeID;
	private String name;
	private int salary;
	
	public Employee (int e, String n, int s)
	{
		employeeID = e;
		name = n;
		salary = s;
	}
	
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return "Employee ID : " +employeeID + "\nName : " +name+ "\nSalary : "+salary;
	}
	
	public static double totalSalary(Employee[] emps)
	{
		double totalSalary =0;
		for (Employee e:emps)
		{
			totalSalary+= e.getSalary();
		}
		return totalSalary;
	}
}
