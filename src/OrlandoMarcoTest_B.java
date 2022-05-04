import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrlandoMarcoTest_B {
	
	OrlandoMarcoClass somm;
	
	@Before
	public void setUp() throws Exception {
		somm=new OrlandoMarcoClass();
	}

	@Test
	public void testOrlandoMet1() {      
		int risultatoAtteso=15;
		int risultatoOttenuto=somm.orlandoMet(5);
		assertEquals(risultatoAtteso,risultatoOttenuto);
	}

	@Test
	public void testOrlandoMet2() {		
		int risultatoAtteso=10;
		int risultatoOttenuto=somm.orlandoMet(4);
		assertEquals(risultatoAtteso,risultatoOttenuto);
	}
	
	@Test
	public void testOrlandoMet3() {		
		int risultatoAtteso=3;
		int risultatoOttenuto=somm.orlandoMet(2);
		assertEquals(risultatoAtteso,risultatoOttenuto);
	}
}
