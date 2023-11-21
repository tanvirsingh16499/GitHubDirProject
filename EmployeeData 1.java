package JavaIO;

import java.io.*;
import java.util.Scanner;

class Appendable extends ObjectOutputStream
{

	public Appendable(OutputStream out) throws IOException {
		super(out);
		 
	}
	protected void writeStreamHeader() {}
	
}
public class EmployeeData {

	public static void main(String[] args) {
		 
		try {
		Scanner s= new Scanner(System.in)	;
		System.out.println("enter id ,name ");	
		int i= s.nextInt();
		String j= s.next();
		Employee e= new Employee(i,j);
		File f= new File("Employee1.txt");
		//true means file will be appendable
		FileOutputStream o= new FileOutputStream("Employee1.txt",true);
		if(f.length()==0)
		{
		ObjectOutputStream os= new ObjectOutputStream(o);
		os.writeObject(e);
		//writeObject method calls writeStreamHeader method -->write some info
		}
		
		else
		{
			Appendable os= new Appendable(o);
			os.writeObject(e);
			
		}
		//loop is for reading data from file 
		//here we use ObjectInputStream class  to read data from file 
		//in this class we have readObject method ( deserialization)
		
		ObjectInputStream k= new ObjectInputStream(new FileInputStream("Employee1.txt"));
		
		do
		{
		e=(Employee)k.readObject();
		e.show();
		}
		while(e!=null);
		
		
		
		}catch(Exception d) {}
		
	}

}
