package br.com.facisa.pp.processoSO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Classe que permite executar um comando de terminal.
 * @author Bruno de Brito
 */
public class Processo {

	/**
	 * Contrutor para criação de um processo
	 * @param cmd recebe um comando
	 * @throws exceção Erro na execucao do comando
	 */
	public static void criarProcesso(String cmd) {
		Process novo = null;
		BufferedReader buffer;
		String entrada;
		try {
			novo = Runtime.getRuntime().exec(cmd);
			buffer = new BufferedReader(new InputStreamReader(novo.getInputStream()));
			novo.waitFor();
			entrada = buffer.readLine();
			while (entrada != null) {
				System.out.println(entrada);
				entrada = buffer.readLine();
			}
			buffer = null;
			novo.destroy();
			System.gc();
		} catch (Exception expection) {
			System.out.println("Erro na execucao do comando");
		}
	}
}