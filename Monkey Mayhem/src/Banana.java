import java.awt.Color;

public class Banana extends Actor
{	
	private boolean existence = true;
	
	public Banana(int startX, int startY)
	{
		super(startX, startY, 50, 50, Color.YELLOW);

	}
	public void move()
	{
		super.shift(0, 5);
	}
	public void disappear()
	{
		super.reset();
	}
	public boolean getExistence()
	{
		boolean temp = existence;
		existence = false;
		return temp;
	}
}
