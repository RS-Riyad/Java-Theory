package cls_obj;

public class Box {
	int height;
	int width;

	public static void main(String[] args)
	{
		Box x1= new Box();
		x1.height=10;
		x1.width=20;
		Box x2= new Box();
		x2.height=30;
		x2.width=40;
		
		System.out.println("Height of box1 =" +x1.height);
		System.out.println("Width of box1 =" +x1.width);
		System.out.println("Height of box2 =" +x2.height);
		System.out.println("Width of box1 =" +x2.width);
	}
}
