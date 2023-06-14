package finalAssignment;

public class Main {
	public static void main(String[] args)
	{
		 Professor e1 = new Professor(5592, "Riyad", 90000, "CSE");
		 Administrator e2 = new Administrator(1234, "Boltu", 50000, "SWE");
		 SupportStaff e3 = new SupportStaff(5678, "John", 40000, "Office Assistant");
		
		System.out.println(e1.toString());
		System.out.println("\n");
		System.out.println(e2.toString());
		System.out.println("\n");
		System.out.println(e3.toString());
		System.out.println("\n");
		
		
		Employee[] emps = {e1, e2, e3};
		double totalSalary = Employee.totalSalary(emps);
		System.out.println("Total Salary : " +totalSalary);
	}

}
