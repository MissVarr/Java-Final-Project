import java.awt.Color;

public class Monkey extends Actor
{
	private boolean right = true;
	private boolean isAlive = true;
	
	public Monkey(int startX, int startY)
	{
		super(startX, startY, 100, 100, Color.DARK_GRAY);
	}

	public void move()
	{
		if(getX() == 100)
		{
			right = true;
		}
		if(getX() == 800)
		{
			right = false;
		}
		
		if(right)
		{
			super.shift(10, 0);
		}
		else
		{
			super.shift(-10, 0);
		}
	}
	
	public boolean isAlive()
	{
		return isAlive;
	}
	public void kill()
	{
		isAlive = false;
	}
}
