import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BranchMain extends JPanel implements ActionListener
{
		Branch br1;
		Timer time;

		public BranchMain() 
		{
			br1 = new Branch(0,0);
			time = new Timer(5, this);
			time.start();
		}

		public void actionPerformed(ActionEvent e) 
		{
			br1.move();
			repaint();
		}

		public void paint(Graphics g) 
		{
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.BLACK);
			g2d.fillRect(br1.x, br1.y, 100, 50);
		}
		public static void main(String[] args)
		{
			JFrame frame = new JFrame("Branch");
			frame.setVisible(true);
			frame.setSize(1000, 1000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add((Component) new BranchMain());
		}
}
