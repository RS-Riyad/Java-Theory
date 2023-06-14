package abstraction;

public class Car extends Vehicle {

	public void move()
	{
		System.out.println("Car moves faster");
	}
	public static void main(String[] args)
	{
		Car x=new Car();
		x.move();
		x.carry();
	}
}
