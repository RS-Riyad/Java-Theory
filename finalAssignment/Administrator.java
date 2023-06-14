package finalAssignment;

public class Administrator extends Employee {
	private String department;
	
	public Administrator(int e, String n, int s, String d)
	{
		super(e,n,s);
		department = d;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public String toString()
	{
		return super.toString() + "\nDepartment : " +department;
	} 
}
