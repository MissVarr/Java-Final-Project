import java.awt.Rectangle;

public abstract class Actor
{
	
	int x, y, length, width;
	
	abstract void move();
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public Rectangle hitBox()
	{
		return (new Rectangle(x, y, length, width));
	}
	
}
