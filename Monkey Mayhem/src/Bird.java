
public class Bird extends Actor
{
	boolean right = true;
	
	public Bird(int startX, int startY, int l, int w)
	{
		x = startX;
		y = startY;
		length = l;
		width = w;
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
		
		y++;
	}

}
