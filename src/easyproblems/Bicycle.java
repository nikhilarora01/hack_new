package easyproblems;

public interface Bicycle {
	void changeCandance(int newValue);
	void changeGear(int newValue);
	void applyBreaks(int increment);
	void accelerate(int decrement);
	

}
class Hero implements Bicycle{
	int cadence=0;
	int gear=0;
	int applyBreaks=1;
	private int candence;
	@Override
	public void changeCandance(int newValue) {
		candence = newValue;
		
	}
	@Override
	public void changeGear(int newValue) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void applyBreaks(int increment) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void accelerate(int decrement) {
		// TODO Auto-generated method stub
		
	}
	
}