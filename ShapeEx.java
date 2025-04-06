abstract class Shape	
{	
	abstract void show();
	void display()
	{	
		System.out.println("Shape display");	
	}
}
class Circle extends Shape
{
	void show()
	{
		System.out.println("Circle show ");	
	}
}
class Rectangle extends Shape
{
	void show()
	{
		System.out.println("Rectange show ");	
	}
}
class ShapeEx
{
	public static void main(String s[])
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