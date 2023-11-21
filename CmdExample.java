package day12;
//this program demonstrate Command line argument 
//value which we pass to main as argument  during run time 
//******to compile program on command prompt 

//javac  CmdExample.java 

//java CmdExample  Noida Delhi Faridabad  

public class CmdExample {

	
	public static void main(String[]  args) {
		 
		System.out.println(args[0]);//Noida
		System.out.println(args[1]);//Delhi
		System.out.println(args[2]);//Faridabad
		System.out.println(args[3]); //ArrayIndexOutOfBoundsException
		System.out.println("bye");

	}

}
