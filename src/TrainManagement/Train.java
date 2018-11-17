package TrainManagement;

import java.util.ArrayList;

public class Train {
	
	private double length; 
	private int location;
	private double redZone; 
	private double yellowZone; 
	private double blueZone;
	private ArrayList<Cart> carts;
	private int trainId; 
	private double speed;

	public Train()
	{
		trainId = 0;
		carts = new ArrayList<Cart>();
		location = 0;
		length = 0;
		
	}
	public Train(int trainId, ArrayList<Cart> carts, int location, double speed)
	{
		this.trainId = trainId;
		this.carts = carts;
		this.location = location;
		this.speed = speed;
		this.CalculateLength();
	}
	enum states 
	{
		INMOTION, IDLE, OOS, EMR
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public double getRedZone() {
		return redZone;
	}
	public void setRedZone(double redZone) {
		this.redZone = redZone;
	}
	public double getYellowZone() {
		return yellowZone;
	}
	public void setYellowZone(double yellowZone) {
		this.yellowZone = yellowZone;
	}
	public double getBlueZone() {
		return blueZone;
	}
	public void setBlueZone(double blueZone) {
		this.blueZone = blueZone;
	}
	public ArrayList<Cart> getCarts() {
		return carts;
	}
	public void setCarts(ArrayList<Cart> carts) {
		this.carts = carts;
	}
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void CalculateLength()
	{
		double sum =0;
		for(int i=0; i< this.carts.size();i++)
		{
			sum += carts.get(i).getLength();
		}
		this.length = sum;
	}
	public void CalculateBlueZone()
	{
	}
	public void CalculateRedZone()
	{
		
	}
	public void CalculateYellowZone()
	{
		
	}
}
