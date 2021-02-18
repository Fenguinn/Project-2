
public class Management extends Fulltime {
	private double bonus;
	private static final int MANAGER = 1;
	private static final int DEPARTMENT_HEAD = 2;
	private static final int DIRECTOR = 3;
	private static final double MANAGER_BONUS = 5000;
	private static final double HEAD_BONUS    = 9500;
	private static final double DIRECTOR_BONUS = 12000;
	//private int role;
	
	public Management(Profile profile,double salary, int managementRole) {
		//this.role = managementRole;
		super(profile,salary);
		
		switch(managementRole) 
		{
			case 1:
				setBonus(MANAGER_BONUS);
				break;
			case 2:
				setBonus(HEAD_BONUS);
				break;
			case 3:
				setBonus(DIRECTOR_BONUS);
				break;
		}
		super.setSalary(salary+bonus);
		
	}
	
	
	private void setBonus(double roleBonus) {
		this.bonus = roleBonus;
	}
	
	@Override
	public void calculatePayment() {
		super.calculatePayment();
		
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
