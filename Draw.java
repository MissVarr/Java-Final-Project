import javax.swing.*;

public class Draw 
{
	private static JFrame frame = new JFrame("MONKEY MAYHEM");
	private enum STATE{
		MENU,
		GAME
	};
	
	private static STATE State = STATE.MENU;
	
	public static void main(String[] args) 
	{
		Menu.display();
	}
	
	public static void changeState(){
		if(State == STATE.MENU){
			State = STATE.GAME;
			frame.setVisible(true);
			frame.setSize(1000, 1000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(new Paint());
		}
		else{
			State = STATE.MENU;
			frame.setVisible(false);
			Menu.display();
		}
	}
}
