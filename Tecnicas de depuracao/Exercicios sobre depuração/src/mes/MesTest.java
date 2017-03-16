package mes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MesTest 
{
	private Mes mes;
	
	@Test
	public void testJaneiro()
	{	mes = new Mes("janeiro");
		assertEquals(1, mes.getNumero());
		mes = new Mes(1);
		assertEquals("janeiro", mes.getNome());
	}
	
	@Test
	public void testFevereiro()
	{	mes = new Mes("fevereiro");
		assertEquals(2, mes.getNumero());
		mes = new Mes(2);
		assertEquals("fevereiro", mes.getNome());
	}
	
	@Test
	public void testMarco()
	{	mes = new Mes("março");
		assertEquals(3, mes.getNumero());
		mes = new Mes(3);
		assertEquals("março", mes.getNome());
	}
	
	@Test
	public void testAbril()
	{	mes = new Mes("abril");
		assertEquals(4, mes.getNumero());
		mes = new Mes(4);
		assertEquals("abril", mes.getNome());
	}
	
	@Test
	public void testMaio()
	{	mes = new Mes("maio");
		assertEquals(5, mes.getNumero());
		mes = new Mes(5);
		assertEquals("maio", mes.getNome());
	}

	@Test
	public void testJunho()
	{	mes = new Mes("junho");
		assertEquals(6, mes.getNumero());
		mes = new Mes(6);
		assertEquals("junho", mes.getNome());
	}
	
	@Test
	public void testJulho()
	{	mes = new Mes("julho");
		assertEquals(7, mes.getNumero());
		mes = new Mes(7);
		assertEquals("julho", mes.getNome());
	}
	
	@Test
	public void testAgosto()
	{	mes = new Mes("agosto");
		assertEquals(8, mes.getNumero());
		mes = new Mes(8);
		assertEquals("agosto", mes.getNome());
	}
	
	@Test
	public void testSetembro()
	{	mes = new Mes("setembro");
		assertEquals(9, mes.getNumero());
		mes = new Mes(9);
		assertEquals("setembro", mes.getNome());
	}
	
	@Test
	public void testOutubro()
	{	mes = new Mes("outubro");
		assertEquals(10, mes.getNumero());
		mes = new Mes(10);
		assertEquals("outubro", mes.getNome());
	}
	
	@Test
	public void testNovembro()
	{	mes = new Mes("novembro");
		assertEquals(11, mes.getNumero());
		mes = new Mes(11);
		assertEquals("novembro", mes.getNome());
	}
	
	@Test
	public void testDezembro()
	{	mes = new Mes("dezembro");
		assertEquals(12, mes.getNumero());
		mes = new Mes(12);
		assertEquals("dezembro", mes.getNome());
	}
}
