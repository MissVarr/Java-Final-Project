import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Paint extends JPanel implements ActionListener
{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Timer time1;
		int count = 0;
		Monkey m;
		int score;

		public Paint() 
		{
			actors.add(new Branch(100, -200));
			actors.add(new Banana(475, -500));
			actors.add(new Branch(750, -800));
			m = new Monkey(100, 800);
			time1 = new Timer(5, this);
			time1.start();
		}
		
		
		public void actionPerformed(ActionEvent e) 
		{					
			
			if (m.isAlive)
			{
				if (actors.get(count % 3).getY() == 1000)
				{	
					System.out.println(actors);
					int rnd = (int)((Math.random() * 6) + 1);
					if(rnd == 1)
					{
						actors.add(new Branch(100, -50));
						actors.add(new Banana(475, -500));
						actors.add(new Branch(750, -800));	
					}
					else if(rnd == 2)
					{
						actors.add(new Branch(100, -50));
						actors.add(new Banana(475, -500));
						actors.add(new Branch(100, -800));
					}
					else if(rnd == 3)
					{
						actors.add(new Snake(850, -150));
						actors.add(new Banana(475, -600));	
						actors.add(new Branch(100, -800));	
					}
					else if(rnd == 4)
					{
						actors.add(new Snake(850, -150));
						actors.add(new Banana(475, -550));
						actors.add(new Snake(100, -850));
					}
					else if(rnd == 5)
					{
						actors.add(new Banana(475, -50));
						actors.add(new Banana(475, -450));
						actors.add(new Banana(475, -850));
					}
					else if(rnd == 6)
					{
						actors.add(new Branch(100, -50));
						actors.add(new Branch(750, -450));
						actors.add(new Branch(100, -850));
					}

				}
				
				for(int i = 0; i < actors.size(); i++)
				{
					if(actors.get(i).getY() >= 1000)
					{
						actors.remove(i);
						i--;
						count ++;
					}
				}
				
				this.collisionDetection();
				
				for(Actor a: actors)
				{
					a.move();
				}
				repaint();
			}
			else
			{
				 repaint();
			}
			
		}
		
		public void paint(Graphics g) 
		{
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			
			if(m.isAlive == false)
			{
                g2d.drawString("COLLISION", 350, 50);

			}
			
			g2d.setColor(Color.BLACK);
			g2d.fillRect(m.getX(), m.getY(), m.getLength(), m.getWidth());
			
			for (Actor a: actors)
			{
				g2d.setColor(Color.YELLOW);
				g2d.fillRect(a.getX(), a.getY(), a.getLength(), a.getWidth());
			}
		}
		public void collisionDetection()
		{
			Rectangle rec1 = m.hitBox();
			for (Actor a: actors)
			{
				Rectangle rec2 = a.hitBox();
				if(rec1.intersects(rec2))
				{
					if(a instanceof Banana)
					{
						score++;
					}
					else
					{
						m.isAlive = false;
					}
				}
			}
		}
		public int getScore()
		{
			return score;
		}
}
