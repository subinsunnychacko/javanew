package Exceptionsample;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Sample.vote(11);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Below 18");
		}

	}
	public static void vote(int age) throws ArithmeticException
	{
		if (age<18)
		{
			throw new ArithmeticException("Invalid");
		}
		else
		{
			System.out.println("Valid");
		}
	}

}
