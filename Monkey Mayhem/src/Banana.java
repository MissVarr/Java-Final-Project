import java.awt.Color;

public class Banana extends Actor
{	
	public Banana(int startX, int startY)
	{
		super(startX, startY, 50, 50, Color.YELLOW);

	}
	public void move()
	{
		super.shift(0, 5);
	}
	//Method which removes banana
	public void disappear()
	{
		super.reset();
	}
}
