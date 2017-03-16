package gerador;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeradorDePrimoTest 
{
	private GeradorDePrimo gerador;
	
	@Before
	public void criarGerador()
	{	gerador = new GeradorDePrimo();
	}
	
	@Test
	public void testUmPrimo()
	{	assertEquals(2, gerador.getProxPrimo());
	}
	
	@Test
	public void testDoisPrimos()
	{	assertEquals(2, gerador.getProxPrimo());
		assertEquals(3, gerador.getProxPrimo());
	}
	
	@Test
	public void testTresPrimos()
	{	assertEquals(2, gerador.getProxPrimo());
		assertEquals(3, gerador.getProxPrimo());
		assertEquals(5, gerador.getProxPrimo());
	}
}

