package Interface;

public class Audiocall implements WhatsappCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audiocall obj2=new Audiocall();
		obj2.connect();
		obj2.mute();
		obj2.disconnect();

	}
	public void connect()
	{
		System.out.println("Print connect");
	}
	public void mute()
	{
		System.out.println("Print mute");
	}
	public void disconnect()
	{
		System.out.println("Print disconnect");
	}

}
