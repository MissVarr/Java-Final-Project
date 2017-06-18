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
		if(x == 100)
		{
			right = true;
		}
		if(x == 900)
		{
			right = false;
		}
		
		if(right)
		{
			x+= 800;
		}
		else
		{
			x-= 800;
		}
	}
	
}
