import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class AnhoTest {
	Anho anho;
	
	@Before
	public void iniciando(){
		anho = new Anho();
	}
	
	@Test
	public void valorVacio() {
		assertEquals(false, anho.esAnho());
	}
	
	@Test
	public void anhoNegativo() {
		anho.setAnho(-165);
		assertEquals(false, anho.esAnho());
	}
	
	@Test
	public void anhoPositivo() {
		anho.setAnho(3);
		assertEquals(true, anho.esAnho());
	}
	
	@Test
	public void anhoNoDivisbleEntre4() {
		anho.setAnho(3);
		assertEquals(false, anho.esBisiesto());
	}
	
	@Test
	public void anhoDivisbleEntre4() {
		anho.setAnho(4);
		assertEquals(true, anho.esBisiesto());
	}
	
	@Test
	public void anhoDivisbleEntre4yNo100() {
		anho.setAnho(4);
		assertEquals(true, anho.esBisiesto());
	}
	
	@Test
	public void anhoDivisbleEntre4y100() {
		anho.setAnho(200);
		assertEquals(false, anho.esBisiesto());
	}
	
	@Test
	public void anhoDivisbleEntre4y100peroNo400() {
		anho.setAnho(100);
		assertEquals(false, anho.esBisiesto());
	}
	@Test
	public void anhoDivisbleEntre4y100y400() {
		anho.setAnho(800);
		assertEquals(true, anho.esBisiesto());
	}
}
