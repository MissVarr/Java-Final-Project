import java.awt.Color;

public class Snake extends Actor
{
	boolean right = true;
	
	public Snake(int startX, int startY)
	{
		super(startX, startY, 50, 150, Color.GREEN);
	}
	
	public void move()
	{
		super.shift(0, 5);
	}
}
