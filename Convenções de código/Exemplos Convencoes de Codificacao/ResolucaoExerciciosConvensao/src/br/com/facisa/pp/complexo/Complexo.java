package br.com.facisa.pp.complexo;

/**
 * Essa classe é responsável por criar um número complexo.
 * @author Bruno de Brito.
 */
public class Complexo {
	private double Real = 0.0;
	private double imaginario = 0.0;

	/**
	 * Cria um numero complexo.
	 * @param r parte real do numero complexo.
	 * @param i parte imaginaria do numero complexo.
	 */
	public Complexo(double r, double i) {
		Real = r;
		imaginario = i;
	}

	/**
	 * Soma um valor inteiro ao numero imaginario
	 * @param n valor inteiro a ser somado
	 */
	public void soma(int n) {
		Real += n;
		imaginario += n;
	}

	/**
	 * Soma um numero imaginario a este numero imaginario
	 * @param C numero imaginario a ser somado
	 */
	public void soma(Complexo C) {
		Real += C.Real;
		imaginario += C.imaginario;
	}
}