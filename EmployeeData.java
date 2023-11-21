package day12;

//this is an example for inner classes
class Employee
{ String name;
  int age;
  static int code=22;
	class salesEmp
	{
	int target ;
	void get(String a,int b,int c)
	{
	name=a;
	age=b;
	target=c;
	
	}
	
	void display()
	{
		System.out.println(name +"  "+ age +" "+target + code);
	}
	}
	 
}
public class EmployeeData {

	public static void main(String[] args) {

		Employee e= new Employee();
		Employee.salesEmp s= e.new salesEmp();
		s.get("rajan", 1, 2300);
		s.display();
	}

}
