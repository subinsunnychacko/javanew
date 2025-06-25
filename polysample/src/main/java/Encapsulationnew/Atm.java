package Encapsulationnew;

public class Atm {
	private int accountno;
	private int pinno;
	private int money;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void setData(int accountno,int pinno,int money)
	{
		this.accountno=accountno;
		this.money=money;
		this.pinno=pinno;
	}
	public void getData()
	{
		System.out.println("Amount"+ money);
	}

}
