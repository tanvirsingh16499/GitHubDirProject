package day20_collection_generics;

//create a generic class . in which type of fields should only be of Number  
//at line 5 generic class or parameterized class
class Testing<R extends Number>
{
	R a,b;
	void show(R x,R y)
	{
		a=x;
		b=y;
		System.out.println(a +"  "+ b);
	}
}
public class BoundType {

	public static void main(String[] args) {
		 
		Testing <Integer>p = new Testing();
		Testing <Float>p1 = new Testing();
		Testing <Byte>p2 = new Testing();
		//Testing <String>p3 = new Testing();
		

	}

}
