public class Banana extends Actor
{	
	public Banana(int startX, int startY)
	{
		x = startX;
		y = startY;
		length = 50;
		width = 50;
	}
	public void move()
	{
		y+= 1;
	}
	public void disappear()
	{
		length = 0;
		width = 0;
	}
}
