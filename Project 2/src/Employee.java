import java.text.DecimalFormat;
/*
 String formattedPay = df.format(the salary / hourly wage goes in here);
 
 */

public class Employee {
	private Profile employeeProfile;
	private double payPerPeriod;
	//private int hours;
	//private double wage;
	
	public Date getDate() {
		return this.employeeProfile.getDate();
	}
	
	public String getName() {
		return this.employeeProfile.getName();
	}
	
	public Employee(Profile newHire) {
		this.employeeProfile = newHire;
		
	}
	

	public void setPayPerPeriod(double payment ) {
		this.payPerPeriod = payment;
	}
	
	
	public void calculatePayment() {
		
	}
	
	public String formatPayments(double payment) {
		DecimalFormat df = new DecimalFormat("$###.##");
		String formattedPay = df.format(payment);
		return formattedPay;
	}
	
	
	/**
	 * Overriding the equals method inherited from the object class.
	 * Compares if this object is equal to another object based on certain criteria.
	 * @param obj is an object that is being compared to this object
	 * @return true if this object is equal to the other object, false if not equal to
	 */
	@Override
	public boolean equals(Object obj){
		if (obj == null) {
			return false;
		}
		else if (obj instanceof Employee){
			Employee other = (Employee)obj;
			if (this.employeeProfile.equals(other.employeeProfile))
				return true;
		}
		return false;
	}
	
	/**
	 * Overriding the toString method of inherited from the object class.
	 * @returns a string representing this object
	 */
	@Override
	public String toString() {
		//DONT FORGET TO IMPORT THE DECIMAL LIBRARY !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		return this.employeeProfile.toString()+ "::Payment $" + this.payPerPeriod;  
		
	}
}
