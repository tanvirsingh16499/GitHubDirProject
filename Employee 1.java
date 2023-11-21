package JavaIO;
import java.io.Serializable;
class Employee implements Serializable
{
	int empid;
    String name;

public Employee(int empid, String name) {
	super();
	this.empid = empid;
	this.name = name;
}

void show()
{
	System.out.println(empid+"  "+name );
}
}