import javax.swing.*;

public class Draw 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Collision Detection");
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Paint());
	}
}
