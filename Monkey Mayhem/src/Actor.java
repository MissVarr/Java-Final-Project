import java.awt.Color;
import java.awt.Rectangle;

//The Actor class is a superclass that provides code for all objects on the field 
//This includes the monkey, bananas, branches, and snakes

public abstract class Actor
{
	//fields
	private int x;
	private int y;
	private int length;
	private int width;
	private Color color;
	
	//constructors
	public Actor(int x1, int y1, int l, int w, Color c)
	{
		x = x1;
		y = y1;
		length = l;
		width = w;
		color = c;
	}
	
	//Methods
	
	
	//Alter the x or y coordinates of the Actors
	public abstract void move();
	
	public void shift(int nx, int ny)
	{
		x+= nx;
		y+= ny;
	}
	
	//Creates a hitbox that can be used for collision detection
	public Rectangle hitBox()
	{
		return (new Rectangle(x, y, length, width));
	}
	
	//Resets size of actor
	public void reset()
	{
		length = 0;
		width = 0;
	}
	
	//Accessor methods
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
		return width;
	}
	public Color getColor()
	{
		return color;
	}
}
