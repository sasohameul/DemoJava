package study04.Taxi;

public interface Meter {
	
	static final int BASE_FARE = 3500;
	static final int PREMIUM_FARE = 5000;                  

	public abstract void start();

	public abstract void drive(int distance);
	
	public abstract void stop ();
	

}