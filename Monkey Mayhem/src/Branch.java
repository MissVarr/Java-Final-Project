
public class Branch extends Actor
{	
	public Branch(int startX, int startY)
	{
		x = startX;
		y = startY;
		length = 150;
		width = 50;
	}
	
	public void move()
	{
		y+= 5;
	}

}
