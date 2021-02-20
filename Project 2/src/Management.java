
public class Management extends Fulltime {
	private double bonus;
	private int role;
	private static final int MANAGER = 1;
	private static final int DEPARTMENT_HEAD = 2;
	private static final int DIRECTOR = 3;
	private static final double MANAGER_BONUS = 5000.00;
	private static final double HEAD_BONUS    = 9500.00;
	private static final double DIRECTOR_BONUS = 12000.00;
	private static final int PAYPERIODSPERYEAR = 26;
	
	public Management(Profile profile,double salary, int managementRole) {
		super(profile,salary);
		this.role = managementRole;
		switch(managementRole) 
		{
			case MANAGER:
				setBonus(MANAGER_BONUS);
				break;
			case DEPARTMENT_HEAD:
				setBonus(HEAD_BONUS);
				break;
			case DIRECTOR:
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
		String role = null;
		switch(this.role) {
		case MANAGER:
			role = "Manager ";
			break;
		case DEPARTMENT_HEAD:
			role = "Department Head ";
			break;
		case DIRECTOR: 
			role = "Director ";
			break;
		}													//This may be redundant. please check PLEASE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		return super.toString() + role + "Compensation " + super.formatPayments(bonus/(double)PAYPERIODSPERYEAR);
	}
	
	
	
	
}
