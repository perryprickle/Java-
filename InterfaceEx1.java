interface Shape	
{	
	static final double pi=3.14;
	double area();
	void display();	
}
class Circle implements Shape
{
	double radius;
	Circle(double r)
	{
		radius=r;
	}
	void setRadius(double r)
	{
		radius=r;
	}
	double getRadius(double r)
	{
		return radius;
	}
	public double area()
	{
		return pi*radius*radius;
	}
	public void display()
	{
		
		System.out.println("Radius="+radius);
		System.out.println("Area="+area());	
	}
}
class Rectangle implements Shape
{
	double length,width;
	Rectangle(double l, double w)
	{
		length=l;
		width=w;
	}
	void setLength(double l)
	{
		length=l;
	}
	double getLength(double r)
	{
		return length;
	}
	void setWidth(double w)
	{
		width=w;
	}
	double getWidth(double w)
	{
		return width;
	}
	public double area()
	{
		return length*width;
	}
	public void display()
	{
		
		System.out.println("Length="+length);
		System.out.println("Width="+width);
		System.out.println("Area="+area());	
	}
		
		
}
class InterfaceEx1
{
	public static void main(String args[])
	{
		Shape s1;
		Circle c1=new Circle(2.0);
		Rectangle r1=new Rectangle(2.0,3.0);
		System.out.println("Circle");
		s1=c1;
		s1.display();
		s1.area();
		s1=r1;
		System.out.println("Rectangle");
		s1.display();
		s1.area();	
		
	}	
}
