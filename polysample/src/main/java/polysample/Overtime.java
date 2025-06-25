package polysample;

public class Overtime extends Employee{
	int overtimesal=10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj3=new Overtime();
		obj3.salary();

	}
	public void salary()
	{
		System.out.println("Overtime Salary is "+(salary+overtimesal));
	}

}
