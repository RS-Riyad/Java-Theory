package constructor;

public class Box2 {

	int height;
	int width;
	
	
	public Box2(int h, int w)
	{
		System.out.println("Box is created.");
		this.height=h;
		this.width=w;
	}
	
	public static void main(String[] args)
	{
		
		Box2 x=new Box2(10, 20);
		System.out.println("Height of Box 1 : " +x.height);
		System.out.println("width of Box 1 : " +x.width);
	}
	
	Box2 x1=new Box2(30,40);
	System.out.println("Height of Box 2 : " +x1.height);
	System.out.println("Width of Box 2 : " +x1.width);
			
}
