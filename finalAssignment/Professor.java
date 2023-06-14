package finalAssignment;

public class Professor extends Employee {
	private String subjectOfExpertise;
	
	public Professor (int e, String n, int s, String subOFexp)
	{
		super(e,n,s);
		subjectOfExpertise = subOFexp;
	}
	
	public String getSubjectOfExpertise()
	{
		return subjectOfExpertise;
	}
	
	public String toString()
	{
		return super.toString() + "\nSubject of Expertise : " +subjectOfExpertise;
	}
}
