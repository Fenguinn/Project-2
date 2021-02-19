
public class Parttime extends Employee {
	private double hourlyRate;
	private int hoursWorked;
	private static final int STANDARDHOURSPERPERIOD = 80;
	private static final int MAXHOURSPERPERIOD = 100;
	private static final double OVERTIMERATE = 1.5;
	
	
	
	public Parttime(Profile profile,double rate) {
		super(profile);
		this.hourlyRate = rate;
		
	}
	
	public boolean setHours(int newHours) {
		this.hoursWorked = newHours;
	/*REMOVE THIS?*/	return true;
	}
	
	public int getHours() {
		return this.hoursWorked;
	}
	
	@Override
	public void calculatePayment() {
		if (hoursWorked <80) {
			super.setPayPerPeriod(hourlyRate*hoursWorked);
		}
		else {
			double payment = (hourlyRate*STANDARDHOURSPERPERIOD);
			int overtimeHours = hoursWorked - STANDARDHOURSPERPERIOD;
			payment += overtimeHours*hourlyRate*OVERTIMERATE;
			super.setPayPerPeriod(payment);
		}
		
	}
	
	
	

	/**
	 * Overriding the equals method inherited from the object class.
	 * Compares if this object is equal to another object based on certain criteria.
	 * @param obj is an object that is being compared to this object
	 * @return true if this object is equal to the other object, false if not equal to
	 */
	@Override
	public boolean equals(Object obj){
		return	super.equals(obj);
	}
	
	/**
	 * Overriding the toString method of inherited from the object class.
	 * @returns a string representing this object
	 */
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
}
