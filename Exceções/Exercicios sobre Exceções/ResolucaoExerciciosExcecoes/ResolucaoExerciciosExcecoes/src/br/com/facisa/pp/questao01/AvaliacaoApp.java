package br.com.facisa.pp.questao01;

import java.util.Scanner;

public class AvaliacaoApp
{
	public static void main(String[] args) throws NotaInvalidaException 
	{	Scanner teclado = new Scanner(System.in);
		Avaliacao avaliacao = new Avaliacao();
		System.out.print("Digite nota do est�gio 1: ");
		avaliacao.setNota1(teclado.nextDouble());
		System.out.print("Digite nota do est�gio 2: ");
		avaliacao.setNota2(teclado.nextDouble());
		System.out.println("M�dia: " + avaliacao.getMedia());
		teclado.close();
	}
}
