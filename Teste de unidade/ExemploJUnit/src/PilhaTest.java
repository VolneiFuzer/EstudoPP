import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class PilhaTest 
{
	private Pilha pilha;

	@Before
	public void criarPilha()
	{	pilha = new PilhaDeArray();
	}
	
	@Test(expected=PilhaVaziaException.class)
	public void testPilhaVazia() throws PilhaVaziaException
	{	assertEquals(0, pilha.getTamanho());
		pilha.desempilhar();
	}
	
	@Test
	public void testPilhaComUm() throws PilhaVaziaException
	{	assertEquals(0, pilha.getTamanho());
		pilha.empilhar("Sertanejo");
		assertEquals(1, pilha.getTamanho());
		assertEquals("Sertanejo", pilha.getTopo());
		assertEquals("Sertanejo", pilha.desempilhar());
		assertEquals(0, pilha.getTamanho());
	}
	
	@Test
	public void testPilhaComDois() throws PilhaVaziaException
	{	assertEquals(0, pilha.getTamanho());
		pilha.empilhar("Sertanejo");
		pilha.empilhar("Axé");
		assertEquals(2, pilha.getTamanho());
		assertEquals("Axé", pilha.getTopo());
		assertEquals("Axé", pilha.desempilhar());
		assertEquals(1, pilha.getTamanho());
		assertEquals("Sertanejo", pilha.getTopo());
		assertEquals("Sertanejo", pilha.desempilhar());
		assertEquals(0, pilha.getTamanho());
	}
	
	@Test
	public void testPilhaComTres() throws PilhaVaziaException
	{	assertEquals(0, pilha.getTamanho());
		pilha.empilhar("Sertanejo");
		pilha.empilhar("Axé");
		pilha.empilhar("Swingueira");
		assertEquals(3, pilha.getTamanho());
		assertEquals("Swingueira", pilha.getTopo());
		assertEquals("Swingueira", pilha.desempilhar());
		assertEquals(2, pilha.getTamanho());
		assertEquals("Axé", pilha.getTopo());
		assertEquals("Axé", pilha.desempilhar());
		assertEquals(1, pilha.getTamanho());
		assertEquals("Sertanejo", pilha.getTopo());
		assertEquals("Sertanejo", pilha.desempilhar());
		assertEquals(0, pilha.getTamanho());
	}
}
