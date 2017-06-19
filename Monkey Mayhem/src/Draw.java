import javax.swing.*;

public class Draw 
{
	private static JFrame frame;
	private static boolean state = true;
	
	public static void main(String[] args) 
	{
		//Displays menu
		Menu.display();
	}
	
	public static void changeState()
	{
		//Goes from menu to game and vice versa
		if(state == true)
		{
			state = false;
			frame = new JFrame("MONKEY MAYHEM");
			frame.setVisible(true);
			frame.setSize(1000, 1000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Paint p = new Paint();
			p.setDoubleBuffered(true);
			frame.add(p);
		}
		else
		{
			state = true;
			frame.setVisible(false);
			Menu.display();
		}
	}
}
