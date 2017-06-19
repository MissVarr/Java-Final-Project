import java.awt.Color;

public class Bird extends Actor
{
	boolean right = true;
	
	public Bird(int startX, int startY)
	{
		super(startX, startY, 100, 100, Color.BLUE);
	}
	
	public void move()
	{
		if (getX() == 0)
		{
			right = true;
		}
		if (getX() == 900)
		{
			right = false;
		}
		if (right)
		{
			super.shift(1, 0);
		}
		else 
		{
			super.shift(-1, 0);
		}
		super.shift(0, 1);
	}

}
