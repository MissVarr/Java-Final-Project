import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SnakeTest extends JPanel implements ActionListener {
	Snake s1;
	Timer t;

	public SnakeTest() {
		s1 = new Snake(0, 300);
		t = new Timer(5, this);
		t.start();
	}

	public void actionPerformed(ActionEvent e) {
		s1.move();
		repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.YELLOW);
		g2d.fillRect(s1.x, s1.y, 100, 50);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Snake");
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SnakeTest());
	}
}
