package numero;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestNumero 
{

	private Numero numero;
	
	@Before
	public void criarNumero()
	{	this.numero = new Numero();
	}
	
	@Test
	public void testNumeroZero()
	{	numero.setValor(0);
		assertEquals(0, numero.getValor());
		assertEquals(1, numero.getQtdDigitos());
		assertEquals(1, numero.getFatorial());	
	}
	
	@Test
	public void testNumeroUm()
	{	numero.setValor(1);
		assertEquals(1, numero.getValor());
		assertEquals(1, numero.getQtdDigitos());
		assertEquals(1, numero.getFatorial());
	}
	
	@Test
	public void testNumeroDois()
	{	numero.setValor(2);
		assertEquals(2, numero.getValor());
		assertEquals(1, numero.getQtdDigitos());
		assertEquals(2, numero.getFatorial());
	}
	
	@Test
	public void testNumeroQuatro()
	{	numero.setValor(4);
		assertEquals(4, numero.getValor());
		assertEquals(1, numero.getQtdDigitos());
		assertEquals(24, numero.getFatorial());
	}
	
	@Test
	public void testNumeroDez() 
	{	numero.setValor(10);
		assertEquals(10, numero.getValor());
		assertEquals(2, numero.getQtdDigitos());
	}
	
	
	
	
}
