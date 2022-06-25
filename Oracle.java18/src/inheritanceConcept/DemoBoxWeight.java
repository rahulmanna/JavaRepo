package inheritanceConcept;

public class DemoBoxWeight 
{
	static double volumn;
	public static void main(String[]args)
	{
		BoxWeight boxweight1=new BoxWeight(10,20,15,34.3);
		volumn=boxweight1.volumn();
		System.out.println("Volumn of boxweight1 is " + volumn);
		System.out.println("Weight of boxweight1 is " + boxweight1.weight);
		System.out.println(" ");
		
		BoxWeight boxWeight2=new BoxWeight();
		volumn=boxWeight2.volumn();
		System.out.println("Volumn of boxweight2 is " + volumn);
		
		
	}

}
