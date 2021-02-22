import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Abdullah Salem, Gent Blaku
 *
 */
public class ManagementTest {
	//These are the expected payment for each employee: (salary/26 + bonus/26)
	private static final double POTTERSON_PAYMENT = 4038.46; 
	private static final double JUANITA_PAYMENT   = 3826.92;
	private static final double DONNAWHITE_PAYMENT = 3153.85;
	
	private static final double EPSILON = 0.01;
	/**
	 * Test method for {@link Management#calculatePayment()}.
	 */
	
	@Test
	public void testCalculatePayment() {
		Date date1 = new Date("3/15/2000");
		Profile pottersonProfile = new Profile("Potterson,Kek", "ECE", date1);
		Management pottersonKek = new Management(pottersonProfile, 100000, 1); //manager
		pottersonKek.calculatePayment();
		assertEquals(pottersonKek.getPayPerPeriod(), POTTERSON_PAYMENT, EPSILON );//compare expected payment with employee's actual payment. should be equal.
		
		
		
		Date date2 = new Date("9/15/2000");
		Profile juanitaProfile = new Profile("Juanita,Lopez", "CS", date2);
		Management juanitaLopez = new Management(juanitaProfile, 90000, 2); //department head
		juanitaLopez.calculatePayment(); 
		assertEquals(juanitaLopez.getPayPerPeriod(), JUANITA_PAYMENT, EPSILON);//compare expected payment with employee's actual payment. should be equal.

		
		Date date3 = new Date("12/15/2000");
		Profile donnaProfile = new Profile("Donna,White", "IT", date3);
		Management donnaWhite = new Management(donnaProfile, 70000, 3); //director
		donnaWhite.calculatePayment();
		assertEquals(donnaWhite.getPayPerPeriod(), DONNAWHITE_PAYMENT, EPSILON); //compare expected payment with employee's actual payment. should be equal.
		
//		fail("Not yet implemented");
	}

}
