package feriado;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FeriadoFixoTest 
{	private FeriadoFixo feriadoFixo;	

	@Before
	public void criaFeriadoFixo()
	{	this.feriadoFixo = new FeriadoFixoImplements();
	}
	
	@Test(expected=DataNaoEhFeriadoException.class)
	public void testNaoEhFeriado () throws DataNaoEhFeriadoException
	{	Calendar calendario = Calendar.getInstance();
		calendario.set(2015, 1, 2);
		feriadoFixo.setData(calendario);
	}
	
	@Test
	public void testConfraternizacaoUniversal() throws DataNaoEhFeriadoException
	{	Calendar calendario = Calendar.getInstance();
		calendario.set(2015, 1, 1);
		feriadoFixo.setData(calendario);
		assertEquals("Confraternização Universal", feriadoFixo.getDescricao());	
	}
	
	@Test
	public void testTiradentes() throws DataNaoEhFeriadoException
	{	Calendar calendario = Calendar.getInstance();
		calendario.set(2015, 4, 21);
		feriadoFixo.setData(calendario);
		assertEquals("Tiradentes", feriadoFixo.getDescricao());	
	}
	
	@Test
	public void testDiadoTrabalho() throws DataNaoEhFeriadoException
	{	Calendar calendario = Calendar.getInstance();
		calendario.set(2015, 5, 1);
		feriadoFixo.setData(calendario);
		assertEquals("Dia do Trabalho", feriadoFixo.getDescricao());	
	}
	
	@Test
	public void testIndependenciadoBrasil() throws DataNaoEhFeriadoException
	{	Calendar calendario = Calendar.getInstance();
		calendario.set(2015, 9, 7);
		feriadoFixo.setData(calendario);
		assertEquals("Independência do Brasil", feriadoFixo.getDescricao());	
	}
	
	@Test
	public void testNossaSenhoraAparecida() throws DataNaoEhFeriadoException
	{	Calendar calendario = Calendar.getInstance();
		calendario.set(2015, 10, 12);
		feriadoFixo.setData(calendario);
		assertEquals("Nossa Senhora Aparecida", feriadoFixo.getDescricao());
	}
	
	@Test
	public void testFinados() throws DataNaoEhFeriadoException
	{	Calendar calendario = Calendar.getInstance();
		calendario.set(2015, 11, 2);
		feriadoFixo.setData(calendario);
		assertEquals("Finados", feriadoFixo.getDescricao());
	}
	
	@Test
	public void testProclamacaodaRepublica() throws DataNaoEhFeriadoException
	{	Calendar calendario = Calendar.getInstance();
		calendario.set(2015, 9, 15);
		feriadoFixo.setData(calendario);
		assertEquals("Proclamação da República", feriadoFixo.getDescricao());
	}
	
	@Test
	public void testNatal() throws DataNaoEhFeriadoException
	{	Calendar calendario = Calendar.getInstance();
		calendario.set(2015, 0, 25); // Penguntar para o Bruno...
		feriadoFixo.setData(calendario);
		assertEquals("Natal", feriadoFixo.getDescricao());
	}
	
}
