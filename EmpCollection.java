package day20_collection_generics;
import java.util.*;
class Emp2
{
	int empid;
	String name;
	public Emp2(int empid, String name) {
		 
		this.empid = empid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "  [empid=" + empid + ", name=" + name + "]";
	}
	 
}
public class EmpCollection {

	public static void main(String[] args) {
		
		
		//data can be hardcoded 
		//data can come from database |network
		 Emp2 e= new Emp2(1,"ashu");
		 Emp2 e1= new Emp2(2,"amit");
		 Emp2 e2= new Emp2(3,"neha");
		 Emp2 e3= new Emp2(4,"gagan");
		 Emp2 e4= new Emp2(5,"priya");
		 Emp2 e5= new Emp2(6,"sapana");
		 
		 
		 //System.out.println(e);//call toString method of its own class

		 LinkedList<Emp2> l= new LinkedList<Emp2>();
		 l.add(e);
		 l.add(e1);
		 l.add(e2);
		 l.add(e3);
		 l.add(e4);
		 l.add(e5);
		 l.add(0,new Emp2(100,"om"));
		 l.pop();//remove top element 
		// System.out.println(l);
		 
		 Iterator<Emp2> i=   l.iterator();
		 while(i.hasNext())
		 {
			System.out.println( i.next());
		 }
		 
	}

}

