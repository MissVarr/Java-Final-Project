import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class Paint extends JPanel implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Banana b1;
	Banana b2;
	Timer time;
	//boolean collision = false;

	public Paint() 
	{
		//b1 = new Banana(350, 100);
		b2 = new Banana (450, 0);
		time = new Timer(1, this);
		time.start();
	}

	public void actionPerformed(ActionEvent e) 
	{
		//b1.move();
		b2.move();
		//checkCollision();
		repaint();
	}

	public void paint(Graphics g) 
	{
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream("MonkeyHops.png");
		Image logo = null;
		try {
			logo = ImageIO.read(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(logo, b2.x, b2.y, 75, 50, null);
		//g2d.setColor(Color.YELLOW);
		//g2d.fillRect(b1.x, b1.y, 50, 50);
		//g2d.setColor(Color.GREEN);
		//g2d.fillRect(b2.x, b2.y, 50, 50);
		//if (collision)
			//g2d.drawString("COLLISION", 350, 50);
	}

	/*public void checkCollision() 
	{
		Rectangle ban1 = b1.bounds();
		Rectangle ban2 = b2.bounds();
		if (ban1.intersects(ban2))
		{
			collision = true;
		}
		else
		{
			collision = false;
		}
	}*/

}