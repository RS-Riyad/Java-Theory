package constructor;
//constructor overloading
public class Box {

	public int height,width;
	
	public Box()
	{
		System.out.println("Box created");
	}
	
	public Box(int a, int b)
	{
		this.height=a;
		this.width=b;
	}
	
	public static void main(String[] args)
	{
		Box x1=new Box();
		Box x2=new Box(10,20);
		Box x3=new Box(30,40);
		
		System.out.println("Height : "+x2.height+ "; Width : "+x2.width);
		System.out.println("Height : "+x3.height+ "; Width : "+x3.width);
	}
}
