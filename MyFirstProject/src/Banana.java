import java.awt.Rectangle;

public class Banana 
{
	int x, y;
	boolean down = false;
	
	public Banana(int startX, int startY)
	{
		x = startX;
		y = startY;
	}
	
	public void move()
	{
		y+=5;
		
		/*if (y == 100)
		{
			down = true;
		}
		if (y == 300)
		{
			down = false;
		}
		if (down)
		{
			y--;
		}
		else
		{
			y++;
		}*/
	}
	
	public Rectangle bounds()
	{
		return (new Rectangle(x, y, 50, 50));
	}
	
	

}