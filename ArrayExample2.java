package day2;
//wap to store 5 numbers in an array and print them
//types of loop in java 
/*
 *  for loop
 *  while loop
 *  do while 
 *  enhanced for loop
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		
		int y[]= {3,3,4,4,5,6};
		
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
		
		
		//enhanced loop
		
		for(int  k : y)
		{
			System.out.println(k);
		}

	}

}
