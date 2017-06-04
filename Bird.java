import java.awt.Event;

public class Bird extends Obstacle
{
	private boolean direction;
	public Bird(Location l)
	{
	  setLocation(l);
	  setLength(10);
	  setWidth(10);
    }
	
	public void move()
	{
	  getLocation().getX()++;
	  if (getLocation().getX() == 100)
		{
			direction = true;
		}
		if (getLocation().getX() == 300)
		{
			direction = false;
		}
		if (direction)
		{
			getLocation().getX()--;
		}
		else
		{
		  getLocation().getX()++;
		}
	}
	
}
