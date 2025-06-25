package Interface;

public class Rectangle implements Drawable,Printable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ob=new Rectangle();
		ob.draw();
		ob.print();

	}
	public void draw()
	{
		System.out.println("Rectangle drawing");
	}
	public void print()
	{
		System.out.println("Rectangle printing");
	}

}
