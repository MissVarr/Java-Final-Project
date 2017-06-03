public abstract class Actor 
{
	private int x, y = 0;
	private int length, width = 0
	
	public Actor()
	{
           x = 0;
	   y = 0;
	   length = 0;
	   width = 0;
	}
	
	Location returnLocation();
	void setCollisionBox();
}
