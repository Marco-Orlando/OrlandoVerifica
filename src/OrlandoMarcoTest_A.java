import static org.junit.Assert.*;

import org.junit.Test;

public class OrlandoMarcoTest_A {

	@Test
	public void testOrlandoMet1() {      //Risultato ottenuto: 1
		OrlandoMarcoClass somm=new OrlandoMarcoClass();
		int risultatoAtteso=15;
		int risultatoOttenuto=somm.orlandoMet(5);
		assertEquals(risultatoAtteso,risultatoOttenuto);
	}

	@Test
	public void testOrlandoMet2() {		//Risultato ottenuto: 1
		OrlandoMarcoClass somm=new OrlandoMarcoClass();
		int risultatoAtteso=10;
		int risultatoOttenuto=somm.orlandoMet(4);
		assertEquals(risultatoAtteso,risultatoOttenuto);
	}
	
	@Test
	public void testOrlandoMet3() {		//Risultato ottenuto: 1
		OrlandoMarcoClass somm=new OrlandoMarcoClass();
		int risultatoAtteso=3;
		int risultatoOttenuto=somm.orlandoMet(2);
		assertEquals(risultatoAtteso,risultatoOttenuto);
	}
}
