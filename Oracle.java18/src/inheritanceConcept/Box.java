package inheritanceConcept;

public class Box {

	double width;
	double height;
	double depth;
	//constractor clone of an object
	Box(Box ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	// parameterized constructor
	Box(double w,double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	//Zero argument constructor or parameterless constructor
	Box()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	Box(double len)
	{
		width=height=depth=len;
	}
	public double volumn()
	{
		return width*height*depth;
	}

}
