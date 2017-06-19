import java.awt.Color;

public class Branch extends Actor
{	
	public Branch(int startX, int startY)
	{
		super(startX, startY, 150, 50, Color.BLACK);
	}
	
	public void move()
	{
		super.shift(0, 5);
	}

}
