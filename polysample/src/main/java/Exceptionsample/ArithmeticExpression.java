package Exceptionsample;

public class ArithmeticExpression {

	public static void main(String[] args) {
		
		System.out.println("Program starts");
		try
		{
			int a=10;
			System.out.println(a/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("number is divded by zero");
		}
		catch(NullPointerException ne)
		{
			System.out.println("cannot be null");
		}
		catch(ArrayIndexOutOfBoundsException are)
		{
			System.out.println("Array index out of bound");
		}
		catch(Exception ec)
		{
			System.out.println("parent exception");
		}
		
		finally
		{
			System.out.println("Program ends");
		}
		System.out.println("Program is not over");
		

	}

}
