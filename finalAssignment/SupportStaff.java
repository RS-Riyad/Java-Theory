package finalAssignment;

public class SupportStaff extends Employee {
	private String jobTitle;
	
	public SupportStaff(int e, String n, int s, String j)
	{
		super(e,n,s);
		jobTitle = j;
	}
	
	public String getJobTitle()
	{
		return jobTitle;
	}
	
	public String toString()
	{
		return super.toString() + "\nJob Title : " +jobTitle;
	}
}
