import java.awt.Event;
import java.awt.event.ActionListener;

public class Snake extends Obstacle implements ActionListener
{
	public Snake(Location l)
	{
	  loc = l;
	  collided = false;
	  length = someNum;
	  width = someNum;
	}
	public void move()
	{
	  
	}
    public Location returnLocation()
    { 
      return loc;
    }
    public void actionPerformed(Event e)
    {
    	
    }
