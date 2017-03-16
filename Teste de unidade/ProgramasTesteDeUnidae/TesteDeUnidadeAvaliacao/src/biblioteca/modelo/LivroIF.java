package biblioteca.modelo;

import biblioteca.excecoes.CampoNuloException;
import biblioteca.excecoes.NumeroInvalidoException;
import biblioteca.excecoes.StringVaziaException;

public interface LivroIF 
{	
	/** 
	 * Retorna o titulo do livro
	 * @return titulo do livro
	 */
	public String getTitulo();

	/**
	 * Altera o titulo do livro
	 * @param titulo o titulo do livro 
	 * @throws CampoNuloException se o titulo fornecido for nulo
	 * @throws StringVaziaException se o titulo fornecido for vazio ("", " ", "   ", ...) 
	 */
	public void setTitulo(String titulo) throws CampoNuloException, StringVaziaException;

	/** 
	 * Retorna a edicao do livro
	 * @return edicao do livro
	 */
	public int getEdicao();

	/**
	 * Altera a edicao do livro
	 * @param edicao a edicao do livro 
	 * @throws NumeroInvalidoException se a edicao fornecida for menor que um 
	 */
	public void setEdicao(int edicao) throws NumeroInvalidoException;

	/** 
	 * Retorna a editora do livro
	 * @return editora do livro
	 */
	public String getEditora();

	/**
	 * Altera a editora do livro
	 * @param editora a editora do livro 
	 * @throws CampoNuloException se a editora fornecida for nula
	 * @throws StringVaziaException se a editora fornecida for vazia ("", " ", "   ", ...) 
	 */
	public void setEditora(String editora) throws CampoNuloException, StringVaziaException;
}