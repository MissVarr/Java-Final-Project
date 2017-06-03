public abstract class Actor 
{
	private Location loc;
	private int length, width = 0
	
	public Actor()
	{
           loc = new Location(0,0)
	   length = 0;
	   width = 0;
	}
	
	Location returnLocation();
	void setCollisionBox();
}
