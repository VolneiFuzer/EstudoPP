package email;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import email.excecoes.EmailInvalidoException;
import produto.CodigoDeBarras;
import produto.CodigoDeBarrasImpl;

public class TestEmail 
{
	private Email email;
	
	@Before
	public void criarCodigoDeBarras() throws Exception 
	{	email = new EmailImpl(); 
	}

	@Test
	public void testEmailValido() throws EmailInvalidoException 
	{	email.setEndereco("phulano@dethal.com");
		assertEquals("phulano@dethal.com", email.getEndereco());
		email.setEndereco("phulano@dethal.co");
		assertEquals("phulano@dethal.co", email.getEndereco());
		email.setEndereco("phulano@dethal.com.br");
		assertEquals("phulano@dethal.com.br", email.getEndereco());
		email.setEndereco("phulano1@dethal.com");
		assertEquals("phulano1@dethal.com", email.getEndereco());
		email.setEndereco("phulano_dethal@dethal.com");
		assertEquals("phulano_dethal@dethal.com", email.getEndereco());
		email.setEndereco("phulano-dethal@dethal.com");
		assertEquals("phulano-dethal@dethal.com", email.getEndereco());
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testEmailSemArroba() throws EmailInvalidoException 
	{	email.setEndereco("phulano_dethal.dethal.com");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testEmailDuasArroba() throws EmailInvalidoException 
	{	email.setEndereco("phulano@dethal@dethal.com");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testEmailSemUsuario() throws EmailInvalidoException 
	{	email.setEndereco("@dethal.com");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testEmailSemServidor() throws EmailInvalidoException 
	{	email.setEndereco("phulano@.com");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testEmailSemTerminacaoDominio() throws EmailInvalidoException 
	{	email.setEndereco("phulano@dethal");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testEmailComTerminacaoDominioGrande() throws EmailInvalidoException 
	{	email.setEndereco("phulano@dethal.abcd");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testEmailComTerminacaoPaisGrande() throws EmailInvalidoException 
	{	email.setEndereco("phulano@dethal.com.abc");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testEmailComTerminacaoSimboloImproprioPerc() throws EmailInvalidoException 
	{	email.setEndereco("phulano%dethal@dethal.com.br");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testEmailComTerminacaoSimboloImproprioCifrao() throws EmailInvalidoException 
	{	email.setEndereco("phulano$dethal@dethal.com.br");
	}
}
