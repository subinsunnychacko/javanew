package Encapsulation;

public class Student {
	private String name;
	private int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void setData(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void getData()
	{
		System.out.println("Name"+name);
		System.out.println("age"+age);
	}
	
	

}
