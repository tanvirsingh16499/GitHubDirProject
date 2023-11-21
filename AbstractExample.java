package day8;

abstract class Test
{
	int a=11;
	
	Test()  	   {System.out.println(" abstarct constructor");}
	void print()	{System.out.println("print method ");}
	abstract void show();//method without body 
	//they must be implemented in child class
	
}

class Test2 extends Test
{
	void show()
	{
		System.out.println("show method ");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
