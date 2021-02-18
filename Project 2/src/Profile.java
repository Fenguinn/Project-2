
public class Profile {
	private String name; //employee’s name in the form “lastname,firstname”
	private String department; //department code: CS, ECE, IT
	private Date dateHired;
	
	
	@Override
	public String toString() { 
		return this.name + " " + this.department + " " + this.dateHired;
		
	}
	@Override
	public boolean equals(Object obj) {
			if (obj == null) {
				return false;
			}
			else if (obj instanceof Profile){
				Profile other = (Profile)obj;
				if (this.name.equals(other.name) && this.department.equals(other.department)&& this.dateHired.equals(other.dateHired))
					return true;
			}
			return false;
	} //compare name, department and dateHired
}
