package nekiString;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MetodeTest {
	
	private Metode m;
	
	@Before
	public void setUp(){
		m = new Metode();	
	}

	@After
	public void tearDown(){
		m = null;
	}
	
	@Test
	public void testDuzinaStringa(){
		int brojac = m.duzinaStringa("Danas");
		assertEquals(5, brojac);
	}
	
	@Test
	public void testParniKarakteri(){
		List<String> list = m.parniKarakteri("Danas");
		List<String> expected = Arrays.asList("a", "a");
		assertEquals(expected, list);
	}
	
	@Test
	public void testNeparniKarakteri(){
		List<String> list = m.neparniKarakteri("Danas");
		List<String> expected = Arrays.asList("D", "n", "s");
		assertEquals(expected, list);	
	}
	
	@Test
	public void testVelikaSlova(){
		int brojac = m.velikaSlova("Danas");
		assertEquals(1, brojac);
	}
	
	@Test
	public void testMalaSlova(){
		int brojac = m.malaSlova("Danas");
		assertEquals(4, brojac);
	}
	
	@Test
	public void testNeSlova(){
		List<String> list = m.neSlova("Danas, i sutra.");
		List<String> expected = Arrays.asList(",", ".");
		assertEquals(expected, list);
	}
	
}
