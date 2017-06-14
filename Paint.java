import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Paint extends JPanel implements ActionListener
{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Timer time1;
		int count = 0;

		public Paint() 
		{
			actors.add(new Branch(100, -200, 150, 50));
			actors.add(new Banana(475, -500, 50, 50));
			actors.add(new Branch(750, -800, 150, 50));
			time1 = new Timer(5, this);
			time1.start();
			
		}

		public void actionPerformed(ActionEvent e) 
		{		
			if (actors.get(count).getY() == 1000)
			{
				int rnd = (int)((Math.random() * 2) + 1);
				
				if(rnd == 1)
				{
					actors.add(new Branch(100, -200, 150, 50));
					actors.add(new Banana(475, -500, 50, 50));
					actors.add(new Branch(750, -800, 150, 50));	
				}
				else if(rnd == 2)
				{
					actors.add(new Branch(100, -200, 150, 50));
					actors.add(new Banana(475, -500, 50, 50));
					actors.add(new Branch(100, -800, 150, 50));
				}
				
				count += 3;
			}
			
			for(Actor a: actors)
			{
				a.move();
			}
			repaint();
		}

		public void paint(Graphics g) 
		{
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			
			for (Actor a: actors)
			{
				g2d.setColor(Color.YELLOW);
				g2d.fillRect(a.getX(), a.getY(), a.getLength(), a.getWidth());
			}
		}
}
