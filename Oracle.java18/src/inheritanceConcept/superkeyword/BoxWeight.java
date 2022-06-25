package inheritanceConcept.superkeyword;

public class BoxWeight extends Box
{
	double weight;
	int i;
	
	BoxWeight(BoxWeight ob)
	{
		super(ob);
	}
	BoxWeight(double w,double h,double d,double m)
	{
		super(w,h,d);
	
	}
	BoxWeight()
	{
		super();
	}
	BoxWeight(int a,int b)
	{
		super.i=a;
		i=b;
	}
	public void show()
	{
		System.out.println("i is in superclass " +  super.i);
		System.out.println("i is in subclass " +  i);
	}
	

}
