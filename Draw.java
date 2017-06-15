import javax.swing.*;

public class Draw 
{
	private static JFrame frame = new JFrame("MONKEY MAYHEM");
	private static boolean state = true;
	
	private static STATE State = STATE.MENU;
	
	public static void main(String[] args) 
	{
		Menu.display();
	}
	
	public static void changeState(){
		if(state == true){
			state = false;
			frame.setVisible(true);
			frame.setSize(1000, 1000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(new Paint());
		}
		else{
			state = true;
			frame.setVisible(false);
			Menu.display();
		}
	}
}
