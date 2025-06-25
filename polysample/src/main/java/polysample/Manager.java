package polysample;

public class Manager extends Employee {
	int bonus=1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj2=new Manager();
		obj2.salary();
		

	}
	public void salary()
	{
		System.out.println("Total Salary" + (salary+bonus));
	}

}
