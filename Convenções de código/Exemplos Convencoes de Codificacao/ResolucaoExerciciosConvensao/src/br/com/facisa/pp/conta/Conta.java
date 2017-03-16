package br.com.facisa.pp.conta;

import java.util.Date;

public class Conta {
	private int numero;
	private double saldo = 0.0;
	private Date DataDeAbertura;

	/**
	 * Cria uma conta bancaria com o numero e a data de abertura fornecidas.
	 * @param numero numero da conta
	 * @param DataDeAbertura data de abertura da conta
	 */
	public Conta(int numero, Date DataDeAbertura) {
		this.numero = numero;
		this.DataDeAbertura = DataDeAbertura;
	}

	/**
	 * Deposita uma quantia na conta. A quantia deve ser maior que zer
	 * @param quantia quantia a ser depositada
	 * @return se o deposito foi realizado
	 */
	public boolean depositar(double quantia) {
		boolean realizada = false;
		if (quantia > 0) {
			this.saldo += quantia;
			realizada = true;
		}
		return realizada;
	}

	/**
	 * Saca uma quantia da conta. A quantia deve ser maior que zero e o saldo
	 * deve ser suficiente.
	 * 
	 * @param quantia
	 *            quantia a ser sacada
	 * @return se o saque foi realizado
	 */
	public boolean sacar(double quantia) {
		if ((0 < quantia) && (quantia <= this.saldo)) {
			this.saldo -= quantia;
			return true;
		} else
			return false;
	}

	/**
	 * Transfere um valor desta conta para a conta destino fornecida. A quantia
	 * deve ser maior que zero e o saldo deve ser suficiente.
	 * 
	 * @param quantia
	 *            quantia a ser transferida
	 * @param destino
	 *            conta de destino do valor a ser transferido
	 * @return
	 */
	public boolean tranferir(double quantia, Conta destino) {
		if ((0 < quantia) && (quantia <= this.saldo)) {
			this.saldo -= quantia;
			destino.saldo += quantia;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Retorna o numero da conta.
	 * @return numero da conta
	 */
	public int getNumero() {
		return this.numero;
	}

	/**
	 * Retorna a data de abertura da conta.
	 * @return data de abertura da conta
	 */
	public Date getDataDeAbertura() {
		return this.DataDeAbertura;
	}

	/**
	 * Retorna o saldo da conta.
	 * @return saldo da conta
	 */
	public double getSaldo() {
		return this.saldo;
	}
}
