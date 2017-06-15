import javax.swing.*;

public class Draw 
{
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
			JFrame frame = new JFrame("Collision Detection");
			frame.setVisible(true);
			frame.setSize(1000, 1000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(new Paint());
		}
		else{
			State = STATE.MENU;
			Menu.display();
		}
	}
}
