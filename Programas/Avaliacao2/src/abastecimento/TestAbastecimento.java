package abastecimento;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestAbastecimento
{
	private Abastecimento abastecimento;
	
	@Before
	public void criarAbastecimento()
	{	abastecimento = new Abastecimento(); 
	}

	@Test
	public void testMelhorGasolina()
	{	abastecimento.setGasolina(3.29);
		abastecimento.setAlcool(2.32);
		assertEquals("gasolina", abastecimento.getRecomendacao());
	}
	
	@Test
	public void testMelhorAlcool()
	{	abastecimento.setGasolina(3.29);
		abastecimento.setAlcool(2.29);
		assertEquals("alcool", abastecimento.getRecomendacao());
	}
	
	@Test
	public void testEmpate()
	{	abastecimento.setGasolina(3.29);
		abastecimento.setAlcool(2.30);
		assertEquals("empate", abastecimento.getRecomendacao());
	}
}
