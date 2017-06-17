import java.awt.event.KeyListener;

public class Monkey extends Actor
{
	boolean right = true;
	boolean isAlive = true;
	
	public Monkey(int startX, int startY)
	{
		x = startX;
		y = startY;
		length = 100;
		width = 100;
	}

	public void move()
	{
		/*if(x == 0)
		{
			right = true;
		}
		if(x == 900)
		{
			right = false;
		}
		
		if(right)
		{
			x++;
		}
		else
		{
			x++;
		}*/
		x += 500;
	}
	
}
