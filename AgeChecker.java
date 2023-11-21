package day16_exception;
/*
 * wap to ask age of a person and check if he or she is eligible for 
 * voting or not .in case if age <18 then throw exception
 */
//class AgeException extends RuntimeException //unchecked Exception

class AgeException extends Exception //checked Exception 
{
	AgeException()
	{
		System.out.println(" Age cannot be less then 18 year");
	}
}

public class AgeChecker {

	static void checkAge(int age)//throws AgeException
	{   try {
		if(age<18)
			throw new AgeException();
		else 
			System.out.println(" welcome user");
	}catch(AgeException r) {
		System.out.println(" wreong age");
	}
	}
	public static void main(String[] args) {
		
		AgeChecker.checkAge(2);
	}

}
