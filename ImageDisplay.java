import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class ImageDisplay extends JFrame 
{
  private Image img;
  
  public ImageDisplay()
  {
	 super("Image Test");
	 setSize(1000,800);
	 String pathname = "images/bird.png";
	 try
	 {
	  img = ImageIO.read(new File(pathname));
	 }
	 catch(IOException ex)
	 {
		System.out.print("Can't load");
	 }
   }
  public void paint(Graphics g)
  {
	super.paint(g);
	if(img != null)
	{
	  int x = (getWidth() - img.getWidth(null))/2;
	  int y = (getHeight() - img.getHeight(null)) / 2;
	  g.drawImage(img, x, y, null);
	}
  }
  public static void main(String args[])
  {
	ImageDisplay window = new ImageDisplay();
	window.setLocation(20,20);
	window.setDefaultCloseOperation(EXIT_ON_CLOSE);
	window.setVisible(true);
	}
  }
  
