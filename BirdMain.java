import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BirdMain extends JPanel implements ActionListener
{
  Bird b1;
  Timer t;
  
  public BirdMain()
  {
	  b1 = new Bird(new Location(350,300));
	  t = new Timer(1, this);
	  t.start();
  }
  public void actionPerformed(ActionEvent e)
  {
	b1.move();
	repaint();
  }
  public void paint(Graphics g) 
  {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.YELLOW);
		g2d.fillRect(b1.getLocation().getX(), b1.getLocation().getY(), 50, 50);
  }
  public static void main(String[] args) 
  {
		JFrame frame = new JFrame("Collision Detection");
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add((Component) new BirdMain());
  }
}
