package br.com.facisa.pp.questao04;

import java.util.Scanner;

import br.com.facisa.pp.questao02.MesInvalidoException;

public class IntervaloDeDiasApp 
{
	public static void main(String[] args) throws DataInvalidaException, MesInvalidoException 
	{	Scanner teclado = new Scanner(System.in);
	System.out.print("Digite o dia: ");
		int dia = teclado.nextInt();
		System.out.print("Digite o m�s: ");
		int mes = teclado.nextInt();
		System.out.print("Digite o ano: ");
		int ano = teclado.nextInt();
		Data data = new Data(dia, mes, ano);
		System.out.println("Faltam " + data.getQuantidadeDeDias() + " dia(s) para a data " + dia + "/" + mes + "/" + ano);
	 	teclado.close();
	}
}
