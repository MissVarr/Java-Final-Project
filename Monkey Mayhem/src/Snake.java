
public class Snake extends Actor
{
	boolean right = true;
	
	public Snake(int startX, int startY)
	{
		x = startX;
		y = startY;
		length = 50;
		width = 150;
	}
	
	public void move()
	{
		y+= 5;
	}
}
