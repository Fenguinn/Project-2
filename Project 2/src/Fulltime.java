
public class Fulltime extends Employee {
	private double salary;
	private static final int PAYPERIODSPERYEAR = 26;
	
	
	public Fulltime(Profile newHire, double newSalary) {
		super(newHire);
		this.salary = newSalary;
	}

	
	public void setSalary(double newSalary) {
		this.salary = newSalary;
	}
	
	/*public double getSalary() {
		return this.salary;
	}
	*/
	
	@Override
	public void calculatePayment() {
		double payment = salary / PAYPERIODSPERYEAR;
		super.setPayPerPeriod(payment);
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
		//DONT FORGET TO IMPORT THE DECIMAL LIBRARY !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		return super.toString() + "::FULL TIME::Annual Salary $" + this.salary;
	}
	
	
	
	
	
	
	
}
