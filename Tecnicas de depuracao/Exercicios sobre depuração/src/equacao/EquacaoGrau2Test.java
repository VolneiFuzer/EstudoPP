package equacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EquacaoGrau2Test 
{
	private static EquacaoGrau2 equacao;
	
	@Before
	public void criarEquacao() throws Exception 
	{	equacao = new EquacaoGrau2Impl();
	}

	@Test
	public void testDeltaNegativo() 
	{	equacao.setA(1);
		equacao.setB(-4);
		equacao.setC(5);
		assertEquals(-4, equacao.getDelta(), 0.01);
		assertEquals(0, equacao.getQtdRaizes());
		assertEquals(Double.NaN, equacao.getRaiz1(), 0.0);
		assertEquals(Double.NaN, equacao.getRaiz2(), 0.0);
	}

	@Test
	public void testDeltaZero() 
	{	equacao.setA(4);
		equacao.setB(-4);
		equacao.setC(1);
		assertEquals(0, equacao.getDelta(), 0.01);
		assertEquals(1, equacao.getQtdRaizes());
		assertEquals(0.5, equacao.getRaiz1(), 0.01);
		assertEquals(0.5, equacao.getRaiz2(), 0.01);
	}
	
	@Test
	public void testDeltaPositivo() 
	{	equacao.setA(1);
		equacao.setB(-5);
		equacao.setC(6);
		assertEquals(1, equacao.getDelta(), 0.01);
		assertEquals(2, equacao.getQtdRaizes());
		assertEquals(3.0, equacao.getRaiz1(), 0.01);
		assertEquals(2.0, equacao.getRaiz2(), 0.01);
	}
}
