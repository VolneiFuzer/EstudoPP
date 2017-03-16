package br.com.facisa.pp.exemplosDeTestes;
//importa��es necess�rias
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CicloJUnitTest 
{
	@BeforeClass
	public static void antesDaBateria()
	{	System.out.println("Come�ando bateria de testes...");
	}

	@Before
	public void antesDoTeste()
	{	System.out.println("Come�ando teste");
	}
	
	@Test
	public void teste1()
	{	System.out.println("Testando 1");
	}
	
	@Test
	public void teste2()
	{	System.out.println("Testando 2");
	}
	
	@Test
	public void teste3()
	{	System.out.println("Testando 3");
	}
	
	@After
	public void depoisDoTeste()
	{	System.out.println("Finalizando teste");
	}
	
	@AfterClass
	public static void depoisDaBateria()
	{	System.out.println("Finalizando bateria de testes");
	}
}