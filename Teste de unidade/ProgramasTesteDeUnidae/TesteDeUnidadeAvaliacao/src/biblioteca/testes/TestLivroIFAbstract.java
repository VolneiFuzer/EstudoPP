package biblioteca.testes;

import biblioteca.modelo.LivroIF;
import biblioteca.modelo.VolneiDaSilvaFuzerPaimJuniorLivroIFImplements;

public abstract class TestLivroIFAbstract 
{
	public LivroIF criarImplementacaoLivro()
	{	return new VolneiDaSilvaFuzerPaimJuniorLivroIFImplements();
	}
}
