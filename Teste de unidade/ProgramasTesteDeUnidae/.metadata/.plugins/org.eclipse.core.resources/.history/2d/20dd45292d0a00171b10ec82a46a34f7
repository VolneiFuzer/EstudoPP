package equacao;

/**
 *	Uma equação do segundo grau representa
 *	os pontos que formam um parábola no plano
 *	cartesiano. Toda equação do segundo grau
 *	obedece a equação ax2 + bx + c = 0.
 */
public interface EquacaoGrau2 
{
	/**
	 * Altera o parâmetro a da equação.
	 * @param a novo parâmetro a
	 */
	public void setA(double a);
	
	/**
	 * Altera o parâmetro b da equação.
	 * @param a novo parâmetro b
	 */
	public void setB(double b);
	
	/**
	 * Altera o parâmetro c da equação.
	 * @param a novo parâmetro c
	 */
	public void setC(double c);
	
	/**
	 * Retorna o valor do parâmetro delta da equação.
	 * @return valor do delta
	 */
	public double getDelta();
	
	/**
	 * Retorna a quantidade de raízes da equação.
	 * Uma equação pode possuir: zero raízes, 
	 * se delta < 0; uma raiz, se delta = 0 ou 
	 * duas raízes, se delta > 0.
	 * @return quantidade de raízes
	 */
	public int getQtdRaizes();
	
	/**
	 * Retorna a primeira raiz da equação. Se a equação 
	 * não possuir raíz, deve retornar a constante Double.NaN.
	 * Se a equação possui uma raiz, os métodos getRaiz1 e getRaiz2
	 * devem retornar o mesmo valor.  
	 * @return valor da primeira raiz
	 */
	public double getRaiz1(); 
	
	/**
	 * Retorna a segunda raiz da equação. Se a equação 
	 * não possuir raíz, deve retornar a constante Double.NaN.
	 * Se a equação possui uma raiz, os métodos getRaiz1 e getRaiz2
	 * devem retornar o mesmo valor.  
	 * @return valor da segunda raiz
	 */
	public double getRaiz2();
}
