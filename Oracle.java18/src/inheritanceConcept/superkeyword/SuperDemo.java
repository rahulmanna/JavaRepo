package inheritanceConcept.superkeyword;

public class SuperDemo {
	
	public static void main(String [] args)
	{
		double volumn;
		
		BoxWeight mybox1=new BoxWeight();
		volumn=mybox1.volumn();
		System.out.println("Volumn of mybox1 is " + volumn);
		
		BoxWeight mybox2=new BoxWeight(10,20,30,40);
		volumn=mybox2.volumn();
		System.out.println("Volumn of mybox1 is " + volumn);
		
		BoxWeight mybox3=new BoxWeight(mybox2);
		volumn=mybox3.volumn();
		System.out.println("Volumn of mybox1 is " + volumn);
		
		BoxWeight mybox4=new BoxWeight(10,20);
		mybox4.show();
	}

}
