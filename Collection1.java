package day20_collection_generics;
import java.util.*;
//wap to store n number of names and print them 
//Set -->store unique record 
//collection act like a container 

//HashSet store data in random order |fast |null is allowed 
//LinkedHashSet -->insertion order ||null Allowed
//TreesSet --> ascending order   | slow |null is not allowed 
public class Collection1 {

	public static void main(String[] args) {
		 HashSet<String> h= new HashSet<String>();        //random order
		//LinkedHashSet<String> h= new LinkedHashSet<String>();//insertion order
		//TreeSet<String> h= new TreeSet<String>();            //ascending order
		h.add("amit");
		h.add("neha");
		h.add("gagan");
		h.add("ashu");
		h.add("priya");
		h.add("amita");
		//h.add(null);  //NullPointerException
		h.remove("amita");
		
		System.out.println(h.size());
		
		System.out.println(h);
		
		//HashSet<Double> h2= new HashSet<Double>();
		
		//from line 32 to 37 we are using Iterator interface to traverse collection
		Iterator i= h.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());//i.next will fetch data from collection and print it 
		}

	}

}
