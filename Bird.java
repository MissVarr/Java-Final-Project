import java.awt.Rectangle;
public class Bird extends Obstacle
{
	public Bird(Location l)
	{
	  setLocation(l);
	  setLength(100);
	  setWidth(50);
        }
	
	public void move()
	{
	  boolean right = false;
	  int n = getLocation().getX();
	  if (n == 0)
	  {
        right = true;
	  }
	  if (n == 700)
	  {
		right = false;
	  }
	  if (right)
	  {
	    n++;
	  }
	  else
	  {
	    n--;
	  }
	}
	public Rectangle bounds()
	{
	  return (new Rectangle(getLocation().getX(), getLocation().getY(), 100, 50));
	}
}

