import java.util.Scanner;
import java.util.StringTokenizer;

public class PayrollProcessing {
	private static final int FIRSTINDEX = 0;
	private static final int SECONDINDEX = 1;
	private static final int THIRDINDEX = 2;
	private static final int FOURTHINDEX = 3;
	private static final int FIFTHINDEX = 4;
	private static final int SIXTHINDEX = 5;
	private static final int MAXINPUTS = 6;
	private static final int MANAGER = 1;
	private static final int DEPARTMENT_HEAD = 2;
	private static final int DIRECTOR = 3;
	
	/**
	 * A method that handles the user input and gives appropriate output.
	 * It creates objects of the other classes and calls their public methods to handle data.
	 */
	public void run() {
		String line;
		boolean Quit = false;
		
		System.out.println("Payroll Processing starts.");
		Company company = new Company();
		Scanner input = new Scanner(System.in);
		StringTokenizer tokens;
		String tokensArray[];
		
		while(!Quit){ //Running until the user quits
			line = input.nextLine();
			tokens = new StringTokenizer(line, " ");
			tokensArray = this.tokenizedInput(tokens);
			
			
			
			
			switch(tokensArray[FIRSTINDEX]) 
			{
				case "AP": //Adding part-time employee
					AP(tokensArray, company);
					break;
				case "AF": //Add full time employee
					AF(tokensArray, company);
					break;
				case "AM": //Add management employee
					AM(tokensArray, company);
					break;
				case "R"://Remove employee from company
					this.R(tokensArray, company);
					break;
				case "C"://Calculate payments for every employee
					this.C(tokensArray, company);
					break;
				case "S"://Set the working hours for a part-time employee
					this.S(tokensArray, company);
					break;
				case "PA"://Print the earnings statements for each employee
					this.PA(tokensArray, company);
					break;
				case "PH"://Print the earnings statements for each employee, in order of date hired
					this.PH(tokensArray, company);
					break;
				case "PD"://Print the earnings statements for each employee, grouped by department
					this.PD(tokensArray, company);
					break;
					
				case "Q"://Quits the program
					Quit = true;
					break;
				default: //Any other user input
					System.out.println("Command '" + tokensArray[0] + "' not supported!");
					break;
			}
		}
		
		input.close();
		System.out.println("Payroll Processing completed.");
		return;
	}
	
	
	private void AP(String tokensArray[], Company company) {
		if (Double.parseDouble(tokensArray[FIFTHINDEX]) < 0) {
			System.out.println("Salary cannot be negative.");
			return;
		}
		Parttime newEmployee = new Parttime(new Profile(tokensArray[SECONDINDEX], tokensArray[THIRDINDEX], new Date(tokensArray[FOURTHINDEX])), Double.parseDouble(tokensArray[FIFTHINDEX]));
		addCheck(newEmployee, company, tokensArray);
	}
	
	private void AM(String tokensArray[], Company company) {
		if (Integer.parseInt(tokensArray[SIXTHINDEX]) != MANAGER && Integer.parseInt(tokensArray[SIXTHINDEX]) != DEPARTMENT_HEAD && Integer.parseInt(tokensArray[SIXTHINDEX]) != DIRECTOR) {
			System.out.println("Invalid mangement code.");
			return;
		}
		
		if (Double.parseDouble(tokensArray[FIFTHINDEX]) < 0) {
			System.out.println("Salary cannot be negative.");
			return;
		}
		
		Management newEmployee = new Management(new Profile(tokensArray[SECONDINDEX], tokensArray[THIRDINDEX], new Date(tokensArray[FOURTHINDEX])), Double.parseDouble(tokensArray[FIFTHINDEX]), Integer.parseInt(tokensArray[SIXTHINDEX]));
		addCheck(newEmployee, company, tokensArray);
	}
	
	private void AF(String tokensArray[], Company company) {
		if (Double.parseDouble(tokensArray[FIFTHINDEX]) < 0) {
			System.out.println("Pay rate cannot be negative.");
			return;
		}
		Fulltime newEmployee = new Fulltime(new Profile(tokensArray[SECONDINDEX], tokensArray[THIRDINDEX], new Date(tokensArray[FOURTHINDEX])), Double.parseDouble(tokensArray[FIFTHINDEX]));
		addCheck(newEmployee, company, tokensArray);
	}
	
	private void R(String tokensArray[], Company company) {
		if (company.remove(new Employee(new Profile(tokensArray[SECONDINDEX], tokensArray[THIRDINDEX], new Date(tokensArray[FOURTHINDEX]))))) {
			System.out.println("Employee removed.");
		}
		else {
			System.out.println("Employee does not exist.");
		}
	}
	
	private void C(String tokensArray[], Company company) {
		company.processPayments();
		System.out.println("Calculation of employee payments is done.");
	}
	
	private void S(String tokensArray[], Company company) {
		if (Integer.parseInt(tokensArray[FIFTHINDEX]) > 100) {
			System.out.println("Invalid Hours: over 100.");
			return;
		}
		
		if (Integer.parseInt(tokensArray[FIFTHINDEX]) < 0) {
			System.out.println("Working hours cannot be negative.");
			return;
		}
		
		if (!company.setHours(new Employee(new Profile(tokensArray[SECONDINDEX], tokensArray[THIRDINDEX], new Date(tokensArray[FOURTHINDEX]))))) {
			System.out.println("Employee does not exist.");
			return;
		}
		System.out.println("Working hours set.");
	}
	
	private void PA(String tokensArray[], Company company) {
		
	}
	
	private void PH(String tokensArray[], Company company) {
		
	}
	
	private void PD(String tokensArray[], Company company) {
		
	}
	
	
	private void addCheck(Employee newEmployee, Company company, String tokensArray[]) {
		if (!tokensArray[THIRDINDEX].equals("ECE") && !tokensArray[THIRDINDEX].equals("CS") && !tokensArray[THIRDINDEX].equals("IT")) {
			System.out.println("'" + tokensArray[SECONDINDEX] + "' is not a valid department code.");
			return;
		}
		
		Date newDate = new Date(tokensArray[FOURTHINDEX]);
		if (!newDate.isValid()) {
			System.out.println(newDate.toString() + " is not a valid date!");
			return;
		}
		
		
		
		if(company.add(newEmployee) != true) {
			System.out.println("Employee is already in the list.");
		}
		else {
			System.out.println("Employee added.");
		}
	}
	
	
	
	
	/**
	 * A helper method that converts proper user input into a more usable form
	 * @param token is a stringTokenizer object containing the segmented user input
	 * @return an array that contains the user input separated appropriately 
	 */
	private String[] tokenizedInput(StringTokenizer token) {
		String tokens[] = new String[MAXINPUTS];
		for (int i=0; i<MAXINPUTS; i++) {
			if (token.hasMoreTokens()) {
				tokens[i] = token.nextToken();
			}
		}
		return tokens;
	}
	
}
