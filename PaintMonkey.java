import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class PaintMonkey extends JPanel implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Monkey m1;
	private Monkey m1;
	private Timer time;
	//boolean collision = false;

	public void Paint() 
	{
		m1 = new Monkey (450, 0);
		time = new Timer(1, this);
		time.start();
	}

	public void actionPerformed(ActionEvent e) 
	{
		m1.move();
		//checkCollision();
		repaint();
	}

	public void paint(Graphics g) 
	{
		Image image = null;
        try {
            URL url = new URL("http://www.pngmart.com/files/1/Banana-PNG.png");
            image = ImageIO.read(url);
        } catch (IOException e) {
        	e.printStackTrace();
        }
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image, b2.x, b2.y, 75, 50, null);
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
