package equacao;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EquacaoGrau2Test 
{
	private EquacaoGrau2 equacao;
		
	@Before
	public void criarEquacaoGrau2()
	{
		this.equacao = new EquacaGrau2Implements();
	}
	
	@Test
	public void testNenhumaRaiz()
	{
		equacao.setA(0.0);
		equacao.setB(20.0);
		equacao.setC(5.0);
		assertEquals(400, equacao.getDelta(), 0.01);
		assertEquals(2, equacao.getQtdRaizes());
		assertEquals(Double.NaN, equacao.getRaiz1(), 0.01);
		assertEquals(Double.NaN, equacao.getRaiz2(), 0.01);
	}	
	
	@Test
	public void testUmaRaiz()
	{
		equacao.setA(4);
		equacao.setB(-4);
		equacao.setC(1);
		assertEquals(0, equacao.getDelta(), 0.01);
		assertEquals(1, equacao.getQtdRaizes());
		assertEquals(0.5, equacao.getRaiz1(), 0.01);
		assertEquals(0.5, equacao.getRaiz2(), 0.01);
	}
	
	@Test
	public void testDuasRaiz()
	{
		equacao.setA(1);
		equacao.setB(-5);
		equacao.setC(6);
		assertEquals(1, equacao.getDelta(), 0.01);
		assertEquals(2, equacao.getQtdRaizes());
		assertEquals(3, equacao.getRaiz1(), 0.01);
		assertEquals(2, equacao.getRaiz2(), 0.01);
	}

}
