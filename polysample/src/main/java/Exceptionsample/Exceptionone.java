package Exceptionsample;

public class Exceptionone {

	public static void main(String[] args) {
		
		//int a=10;
		//System.out.println(a/0); //Arithemtic exception
		
		try
		{
		String s=null;
		System.out.println(s.length()); // null point exception
		}
		catch(NullPointerException np)
		{
			System.out.println("String should not be null");
		}

	}

}
