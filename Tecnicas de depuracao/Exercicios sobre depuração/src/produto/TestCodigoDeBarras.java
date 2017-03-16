package produto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import produto.excecoes.CodigoDeBarrasInvalido;

public class TestCodigoDeBarras 
{

	private CodigoDeBarras codigo;
	
	@Before
	public void criarCodigoDeBarras() throws Exception 
	{	codigo = new CodigoDeBarrasImpl(); 
	}

	@Test
	public void testSetNumeroCorreto() throws CodigoDeBarrasInvalido
	{	codigo.setNumero(7891027119485L);
		assertEquals(7891027119485L, codigo.getNumero());
	}
	
	@Test(expected=CodigoDeBarrasInvalido.class)
	public void testSetNumeroMenosDigitos() throws CodigoDeBarrasInvalido
	{	codigo.setNumero(891027119485L);
	}
	
	@Test(expected=CodigoDeBarrasInvalido.class)
	public void testSetNumeroMaisDigitos() throws CodigoDeBarrasInvalido
	{	codigo.setNumero(77891027119485L);
	}
	
	@Test
	public void testCodigoDoPais() throws CodigoDeBarrasInvalido
	{	codigo.setNumero(7891027119485L);
		assertEquals(789, codigo.getPais());
	}
	
	@Test
	public void testDigitoVerificador() throws CodigoDeBarrasInvalido
	{	codigo.setNumero(7891027119485L);
		assertEquals(5, codigo.getVerificador());
	}

}
