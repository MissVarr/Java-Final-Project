import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

//The paint class handles overall game play

public class Paint extends JPanel implements ActionListener
{
		//List of all actors on the field except for the monkey
		private ArrayList<Actor> actors = new ArrayList<Actor>();
		
		private Timer time1;
		
		//Variable used to ensure that objects are properly added to the list
		private int count = 0;
		
		private Monkey m;
		
		//Incremented every time the monkey intersects with a banana
		private static int score;
		
		//Constructor
		public Paint() 
		{
			//Adds initial objects to list
			actors.add(new Branch(100, -200));
			actors.add(new Banana(475, -500));
			actors.add(new Branch(750, -800));
			m = new Monkey(100, 600); //ITS ACTUALLY 800!!!
			
			//Starts the timer which will run the ActionPerformed method 200 times a second
			time1 = new Timer(5, this);
			time1.start();
			Action pressedAction = new AbstractAction() {
				public void actionPerformed(ActionEvent e) 
				{
					if(m.isAlive)
					{
						m.move();
					}
				}
			};
			this.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "pressed");
			this.getActionMap().put("pressed", pressedAction);
		}
		
		
		public void actionPerformed(ActionEvent e) 
		{					
			
			if (m.isAlive)
			{
				//If the first obstacle in a 'set' hits the bottom of the screen
				if (actors.get(count % 3).getY() == 1000)
				{	
					//generate a random number to choose the next panel
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
				
				//Cycle through every Actor in the list and remove those that have passed the bottom of the screen
				for(int i = 0; i < actors.size(); i++)
				{
					if(actors.get(i).getY() >= 1000)
					{
						actors.remove(i);
						i--;
						//add 1 to count so the next set is made at the right time
						count ++;
					}
				}
				
				//Check if a collision is occurring
				this.collisionDetection();
				
				//Move every actor in the list and repaint them in the new positions
				for(Actor a: actors)
				{
					a.move();
				}
				repaint();
			}
			else //if it is not alive, call the paint method
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
                g2d.drawString("GAME IS OVER", 500, 700);

			}
			
			g2d.setColor(Color.BLACK);
			g2d.fillRect(m.getX(), m.getY(), m.getLength(), m.getWidth());
			
			for (Actor a: actors)
			{
				g2d.setColor(Color.YELLOW);
				g2d.fillRect(a.getX(), a.getY(), a.getLength(), a.getWidth());
			}
		}
		
		//check if collision is occurring
		public void collisionDetection()
		{
			//create a rectangle hitbox for the monkey
			Rectangle rec1 = m.hitBox();
			
			//go through each actor and create a hitbox --> check if they intersect and act appropriately
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
						EndGame.display();
						
					}
				}
			}
		}
		public static int getScore()
		{
			return score;
		}
		public static void resetScore()
		{
			score = 0;
		}
}
