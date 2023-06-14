package method_overriding_5;

public class Bike extends Vehicle{

	void run()
	{
		System.out.println("Bike is running safely");
	}
	
	public static void main(String[] args)
	{
		Bike x=new Bike();
		x.run();
	}
}
