package day14;
//wap to create a class Employee having fields like name ,empid.
//create accept method that takes as employee name and empid from user .
//void accept(string dept)
//inside accept method check if dept is sales then create sales class having fields like target 
//and show method 

import java.util.Scanner;

//if dept is It then create It class having fields like projectname ,duration .also create display method 

//in main create Employee class object and call accept method 
public class Employee {

	String name ;
	int empid;
	
	void accept(String dept)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter name aand id");
		name=s.next();
		empid=s.nextInt();
		
		if(dept.equals("sales"))
		{
			class Sales{ 
				void display() {}
				}
			Sales s1= new Sales();
			s1.display();
			
			
		}
		else if(dept.equals("ItDept"))
		{
			class It{}
			 
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
