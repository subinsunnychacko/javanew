package Interface;

public class Videocall implements WhatsappCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Videocall obj=new Videocall();
		obj.connect();
		obj.mute();
		obj.disconnect();

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
