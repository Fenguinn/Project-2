
public class RunProject2 {
	public static void main(String[] args) {
		//new PayrollProcessing().run();
		Company company;
		
		Date date = new Date("2/18/2021");
		Profile johnnyProfile = new Profile("Kid,johnny","CS",date);
		Fulltime johnnyKid = new Fulltime(johnnyProfile,60000);
		System.out.println(johnnyKid.toString());
		
		Date date2 = new Date("1/15/2015");
		Profile henryProfile = new Profile("Bryant,Henry", "IT", date2);
		Parttime henryBryant = new Parttime(henryProfile, 12.5);
		System.out.println(henryBryant.toString());
		
		Date date3 = new Date("3/15/2000");
		Profile pottersonProfile = new Profile("Potterson,Kek", "ECE", date3);
		Management pottersonKek = new Management(pottersonProfile, 100000, 1); //manager
		System.out.println(pottersonKek.toString());
		
		Date date4 = new Date("9/15/2000");
		Profile juanitaProfile = new Profile("Juanita,Lopez", "CS", date4);
		Management juanitaLopez = new Management(juanitaProfile, 90000, 2); //depeartment head
		System.out.println(juanitaLopez.toString());
		
		Date date5 = new Date("12/15/2000");
		Profile donnaProfile = new Profile("Donna,White", "IT", date5);
		Management donnaWhite = new Management(donnaProfile, 70000, 3); //director
		System.out.println(donnaWhite.toString());
		
		
		
		//johnnyKid.setSalary(60000);
		
		
		
		
		
		Parttime guacGuy;
		Management brianWoman;
	}
}