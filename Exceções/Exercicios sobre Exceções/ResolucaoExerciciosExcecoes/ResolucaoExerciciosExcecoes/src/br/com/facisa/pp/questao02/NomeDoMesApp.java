package br.com.facisa.pp.questao02;

import java.util.Scanner;

public class NomeDoMesApp 
{
	public static void main(String[] args) throws MesInvalidoException  
	{	Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o n�mero do m�s: ");
		Mes mes = new Mes(teclado.nextInt());
		System.out.println("Nome do m�s: " + mes.getNome());
	 	teclado.close();
	}
}
