import javax.swing.*;

public class Draw 
{
	private static boolean state = true;
	
	public static void main(String[] args) 
	{
		Menu.display();
	}
	
	public static void changeState()
	{
		JFrame frame = new JFrame("MONKEY MAYHEM");
		if(state == true)
		{
			state = false;
			frame.setVisible(true);
			frame.setSize(1000, 1000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(new Paint());
		}
		else
		{
			state = true;
			frame.setVisible(false);
			Menu.display();
		}
	}
}
