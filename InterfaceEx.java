interface Shape	
{	
	void show();
	void display();
	
}
class Circle implements Shape
{
	public void show()
	{
		System.out.println("Circle show ");	
	}
	public void display()
	{
		System.out.println("Circle display ");	
	}
}
class Rectangle implements Shape
{
	public void show()
	{
		System.out.println("Rectange show ");	
	}
	public void display()
	{
		System.out.println("Rectange display ");	
	}
}
class InterfaceEx
{
	public static void main(String args[])
	{
		Shape s1;
		Circle c1=new Circle();
		Rectangle r1=new Rectangle();
		System.out.println("Circle");
		s1=c1;
		s1.display();
		s1.show();
		s1=r1;
		System.out.println("Rectangle");
		s1.display();
		s1.show();	
		
	}	
}