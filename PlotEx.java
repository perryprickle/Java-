class Plot
{	
	float length;
	float width;
	void setData()
	{	
		length=0.00f;
		width=0.00f;
	}
	void setData(float l, float w)
	{
		length=l;
		width=w;
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
class PlotEx
{
	public static void main(String args[])
	{
		Plot P1=new Plot();
		P1.display();
		P1.setData(10.2f,20.3f);
		P1.display();
	}
}