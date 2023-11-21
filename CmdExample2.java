package day12;
//javac  CmdExample2.java 
//java CmdExample2  Noida Delhi Faridabad   23 23  34354 5 4 54 54 5 65 65  56523sdd 
public class CmdExample2 {

	public static void main(String[] args)
	
	{
	 //in case if user pass any argument to main then using loop we will print all its values 
				for( int i=0;i<args.length;i++)
				{
					System.out.println( " "+ args[i]);
				}
		
		//  ---------------or -----------------------
		//enhanced for loop 
		for(String s:args)
		{
			System.out.println(s);
		}
		 

	}

}
