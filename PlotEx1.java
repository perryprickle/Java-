class Plot
{	
	private float length;
	private float width;
	Plot()
	{	
		length=0.00f;
		width=0.00f;
	}
	Plot(float l, float w)
	{
		length=l;
		width=w;
	}
	Plot(Plot p)
	{
		length=p.length;
		width=p.width;
	}
	void setLength(float l)	
	{
		length=l;
	}
	void setWidth(float w)	
	{
		width=w;
	}
	float getLength()
	{
	  return length;
	}
	float getWidth()
	{
	  return width;
	}
	float area()
	{
		return length*width;
	}
	void display()
	{
		System.out.println("Length="+length);
		System.out.println("Width="+width);
		System.out.println("Area="+area());
	}
}
class PlotEx1
{
	public static void main(String args[])
	{
		Plot p1=new Plot();
		p1.display();
	        Plot p2=new Plot(10.0f,20.0f);
		p2.display();
		Plot p3=new Plot(p2);
		p3.display();
		
		
	}
}