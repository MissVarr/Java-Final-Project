import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;


import javax.imageio.ImageIO;

public class ImageDisplay extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	Bird b1;
	Timer time;

	public ImageDisplay() {
		b1 = new Bird(0, 0);
		time = new Timer(5, this);
		time.start();
	}

	public void actionPerformed(ActionEvent e) {
		b1.move();
		b1.moveDown();
		repaint();
	}

	public void paint(Graphics g) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input1 = classLoader.getResourceAsStream("eagle.png");
		InputStream input2 = classLoader.getResourceAsStream("eagleflipped.png");
		Image image1 = null;
		Image image2 = null;
		try {
			image1 = ImageIO.read(input1);
			image2 = ImageIO.read(input2);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		if(b1.right == true)
		{
			g2d.drawImage(image1, b1.x, b1.y, 100, 50, null);
		}
		else
		{
			
		  g2d.drawImage(image2, b1.x, b1.y, 100, 50, null);
		}
	}
	public Rectangle bounds()
	{
		
	  return (new Rectangle(b1.x,b1.y, 100, 50));
	  
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Birds");
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new ImageDisplay());
	}
}
