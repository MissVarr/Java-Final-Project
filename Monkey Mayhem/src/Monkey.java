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
		if(x == 800)
		{
			right = false;
		}
		
		if(right)
		{
			/*while (x != 800)
			{
				x+= 700;
			}*/
			x+=5;
		}
		else
		{
			/*while (x != 100)
			{
				x-= 700;
			}*/
			x-=5;
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
