
import java.awt.Rectangle;
	public class Snake
	{
		int x, y;
		boolean right = true;
		
		public Snake(int startX, int startY)
		{
			x = startX;
			y = startY;
		}
		
		public void move()
		{
			if (x == 0)
			{
				right = true;
			}
			if (x == 300)
			{
				right = false;
			}
			if (right)
			{
				x++;
			}
			else 
			{
				x--;
			}
		}
		
		public Rectangle bounds()
		{
			return (new Rectangle(x, y, 100, 50));
		}
		
	}

