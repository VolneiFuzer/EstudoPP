package br.com.facisa.pp.questao03;

public class NomeInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public NomeInvalidoException() {
		super("O nome fornecido não pode ser nulo ou vazio");
	}

}
