package supe8;

public class Student extends Person {

	
	private int id;
	private double cgpa;
	
	public Student (String name, int id, int age, double cggpa)
	{
		super(name,age);
		id=id;
		
		cgpa=cgpa;
	}
	public void display()
	{
		super.display();
		System.out.println("ID : "+id);
		
		System.out.println("CGPA : "+cgpa);
	}
	
	public static void main(String[] args)
	{
		Student x=new Student("Juss", 5592, 20, 4.00);
		x.display();
	}
}
