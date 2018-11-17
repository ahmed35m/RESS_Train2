package TrainManagement;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Train {
	
	private double length; 
	private int location;
	private double redZone; 
	private double yellowZone; 
	private double blueZone;
	private List<Cart> cart;
	private static AtomicInteger trainId = new AtomicInteger(11111); 
	
	public Train()
	{
		trainId = trainId.incrementAndGet();
	}
	enum states 
	{
		INMOTION, IDLE, OOS, EMR
	}
	
	public double getLength()
	{
		return length;
	}
	
	public int getLocation()
	{
		return location;
	}
	
	public double getRedZone()
	{
		return redZone;
	}
	
	public double getYellowZone()
	{
		return yellowZone;
	}
	
	public double blueZone()
	{
		return blueZone;
	}
	
	public void setLength(double newLength)
	{
		length = newLength;
	}

	public void setLocation(int newLocation)
	{
		location = newLocation;
	}
	
	public void setRedZone(double newRedZone)
	{
		redZone = newRedZone;
	}
	
	public void setYellowZone (double newYellowZone)
	{
		yellowZone = newYellowZone;
	}
	
	public void setBlueZone (double newBlueZone)
	{
		blueZone = newBlueZone;
	}
}
