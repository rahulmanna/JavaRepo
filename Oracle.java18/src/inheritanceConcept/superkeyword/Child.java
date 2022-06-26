package inheritanceConcept.superkeyword;

public class Child extends Parent {

     Child()
     {
    	 System.out.println("Child class 0-arg consturctor");
     }
     Child(int x)
     {
    	 super(x);
     }
}
