package methodOverriding;

public class BoxWeight extends Box
{
	int k;
	int c;
	
	BoxWeight(int d,int e)
	{
		super(d,e);
	}
	public void show()
	{
		super.show();
		System.out.println(" k and c " + k + " "+ c);
	}

}
