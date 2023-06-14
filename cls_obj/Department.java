package cls_obj;

public class Department {

	private String deptName;
	private int deptCode;
	private String faculty;
	
	public static void main(String[] args)
	{
		Department x1=new Department();
		x1.deptCode=6586;
		x1.deptName="abc";
		x1.faculty="yghjg";
		System.out.print("Dept name : " +x1.deptName+ "; Dept code : " +x1.deptCode+ "; Faculty : " +x1.faculty);
	}
}
