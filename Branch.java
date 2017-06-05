import java.awt.Event;
import java.awt.event.ActionListener;

public class Branch
{ 
  public Branch(int startX, int startY)
  { 
    x = startX;
    y = startY;
  }
  public void moveDown()
  {
    y--;
  }
  public Rectangle bounds()
  {
    return (new Rectangle(x, y, 100, 50));
  }
 
