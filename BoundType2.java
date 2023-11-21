package day20_collection_generics;

class Person
{
	void show()
	{
		System.out.println("welcome");
	}
}
class emp extends Person {}

//at line 9 extends person mean Y can be replaced with Person or child class of person 
public class BoundType2<Y extends Person> {

	Y e;
	void print(Y m)
	{
		e=m;
		e.show(); //calling show method at line 5 
		
	}
	public static void main(String[] args) {
		
		BoundType2<Person> r= new BoundType2<Person>();
		r.print(new Person());
		
		//BoundType2<Integer> r1= new BoundType2();//error 
		
	//	BoundType2<emp> r2= new BoundType2<emp>();

	}

}
