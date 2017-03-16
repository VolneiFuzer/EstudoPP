package contador;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class ContadorDeDigitosTest 
{
	private ContadorDeDigitos contador;
	
	@Before
	public void criarContador()
	{	contador = new ContadorDeDigitos();
	}
	
	@Test
	public void testUmDigito()
	{	contador.setValor(0);
		assertEquals(1, contador.getQtdDigitos());
		contador.setValor(1);
		assertEquals(1, contador.getQtdDigitos());
		contador.setValor(9);
		assertEquals(1, contador.getQtdDigitos());
	}

	@Test
	public void testDoisDigitos()
	{	contador.setValor(10);
		assertEquals(2, contador.getQtdDigitos());
		contador.setValor(11);
		assertEquals(2, contador.getQtdDigitos());
		contador.setValor(19);
		assertEquals(2, contador.getQtdDigitos());
	}
	
	@Test
	public void testTresDigitos()
	{	contador.setValor(100);
		assertEquals(3, contador.getQtdDigitos());
		contador.setValor(111);
		assertEquals(3, contador.getQtdDigitos());
		contador.setValor(199);
		assertEquals(3, contador.getQtdDigitos());
	}
}
