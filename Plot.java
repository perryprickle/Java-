class Plot
{	
	float length;
	float width;
	void setData()
	{	
		length=1.22f;
		width=3.33f;
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