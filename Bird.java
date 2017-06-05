import java.awt.Rectangle;

public class Bird 
{
	int x, y;
	boolean right = true;
	
	public Bird(int startX, int startY)
	{
		x = startX;
		y = startY;
	}
	
	public void move()
	{
		if (x == 0)
		{
			right = true;
		}
		if (x == 900)
		{
			right = false;
		}
		if (right)
		{
			x++;
		}
		else 
		{
			x--;
		}
	}
	
	public Rectangle bounds()
	{
		return (new Rectangle(x, y, 100, 50));
	}
	
}
