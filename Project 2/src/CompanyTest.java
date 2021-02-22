import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Abdullah Salem, Gent Blaku
 *
 */
public class CompanyTest {
	Company testCompany = new Company();
	Date date = new Date("2/18/2021");
	Profile johnnyProfile = new Profile("Kid,johnny","CS",date);
	Fulltime johnnyKid = new Fulltime(johnnyProfile,60000);
	
	
	
	Date date2 = new Date("1/15/2015");
	Profile henryProfile = new Profile("Bryant,Henry", "IT", date2);
	Parttime henryBryant = new Parttime(henryProfile, 12.5);
	//henryBryant.setHours(20);
	
	
	
	
	/**
	 * Test method for {@link Company#add(Employee)}.
	 */
	@Test
	public void testAdd() {
		assertTrue(testCompany.add(johnnyKid));//add new employee, should be true
		assertFalse(testCompany.add(johnnyKid));//add existing employee, should be false
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Company#remove(Employee)}.
	 */
	@Test
	public void testRemove() {
		testCompany.add(johnnyKid);
		assertTrue(testCompany.remove(johnnyKid)); //remove existing employee, should be true
		assertFalse(testCompany.remove(johnnyKid));//remove nonexistent employee, should be false
		
		
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Company#setHours(Employee)}.
	 */
	@Test
	public void testSetHours() {
		testCompany.add(henryBryant);
		assertTrue(testCompany.setHours(henryBryant)); //setting existing parttime employee hours, should be true
		
		assertFalse(testCompany.setHours(johnnyKid)); //setting nonexistent (in the company) employee hours, should be false
		
		testCompany.add(johnnyKid);					  // add fulltime employee
		assertFalse(testCompany.setHours(johnnyKid));// set hours for fulltime employee, should return false
		
		//fail("Not yet implemented");
	}

}
