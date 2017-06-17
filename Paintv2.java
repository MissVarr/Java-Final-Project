import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Game extends JPanel implements ActionListener
{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Timer time1;
		int count = 0;

		public Game() 
		{
			actors.add(new Branch(100, -200));
			actors.add(new Banana(475, -500));
			actors.add(new Branch(750, -800));
			time1 = new Timer(5, this);
			time1.start();
			
		}

		public void actionPerformed(ActionEvent e) 
		{		
			if (actors.get(count).getY() == 1000)
			{
				int rnd = (int)((Math.random() * 4) + 1);
				
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
				count++;

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
			
			for(int i = 0; i < actors.size(); i++)
			{
				ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
				InputStream input1 = classLoader.getResourceAsStream("eagle.png");
				InputStream input2 = classLoader.getResourceAsStream("eagleflipped.png");
				InputStream input3 = classLoader.getResourceAsStream("TreeBranch.png");
				InputStream input4 = classLoader.getResourceAsStream("TreeBranchFlipped.png");
				InputStream input5 = classLoader.getResourceAsStream("thesnake.png");
				InputStream input6 = classLoader.getResourceAsStream("banana.png");
				
				Image image1 = null;
				Image image2 = null;
				Image image3 = null;
				Image image4 = null;
				Image image5 = null;
				Image image6 = null;
				
				try {
					image1 = ImageIO.read(input1);
					image2 = ImageIO.read(input2);
					image3 = ImageIO.read(input3);
					image4 = ImageIO.read(input4);
					image5 = ImageIO.read(input5);
					image6 = ImageIO.read(input6);
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
				if(actors.get(i) instanceof Bird)
				{
					if(actors.get(i).getRight())
					{
						g2d.drawImage(image1, actors.get(i).getX(), actors.get(i).getY(), 100, 50, null);
					}
					else
					{
						
					  g2d.drawImage(image2, actors.get(i).x, actors.get(i).y, 100, 50, null);
					}
				}
				else if(actors.get(i) instanceof Branch)
				{
					if(actors.get(i).getX() > 500)
					{
						g2d.drawImage(image3, actors.get(i).getX(), actors.get(i).y, 100, 50, null);
					}
					else
					{
						
					  g2d.drawImage(image4, actors.get(i).x, actors.get(i).y, 100, 50, null);
					}
				}
				else if(actors.get(i) instanceof Banana)
				{
					g2d.drawImage(image6, actors.get(i).x, actors.get(i).y, 50, 50, null);	
				}
				else
				{
				   g2d.drawImage(image5, actors.get(i).x, actors.get(i).y, 150, 50, null);
				}
			}
		}	
}
