//modifica da github
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsercitazioneJUnit {

	@Test
	void testCalcolaArea1() {
		Trapezio t=new Trapezio(1,2,3); 
		assertEquals(4.5, t.CalcolaArea());
	}
	
	@Test
	void testCalcolaArea2() {
		Trapezio t=new Trapezio(5,5,5);
	assertEquals(25, t.CalcolaArea());
	}
	
	@Test
	void testCalcolaArea3() {
		Trapezio t=new Trapezio(32,1,5);
		assertEquals(82, t.CalcolaArea(),0.5); //tolleranza
	}

}
