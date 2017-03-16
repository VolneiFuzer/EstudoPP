package br.com.facisa.pp.questao03;

import java.util.Scanner;

public class NomeInvertidoApp 
{
	public static void main(String[] args) throws NomeInvalidoException 
	{	Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(teclado.nextLine());
		System.out.println("Nome invertido: " + pessoa.getNomeInvertido());
	 	teclado.close();
	}
}
