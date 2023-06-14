package cls_obj;

public class Student {

	private String id;
	private String name;
	private double cgpa;
	
	public void insert_Record(String i, String n, double c)
	{
		this.id=i;
		this.name=n;
		this.cgpa=c;
	}
	
	public void display_Record()
	{
		System.out.println("ID : " +id);
		System.out.println("Name :" +name);
		System.out.println("CGPA :" +cgpa);
	}
	
	public static void main(String[] args)
	{
		Student x=new Student();
		x.insert_Record("5592", "Juss", 4.00);
		x.display_Record();
	}
}
