import java.util.Scanner;

public class InsertionSortArrayApp 
{	
	public static void main(String[] args)
	{	Scanner quantidadeAlunos = new Scanner(System.in);
		System.out.print("Digite a quantidade de Alunos: ");
		
		int quantidade = quantidadeAlunos.nextInt();
		
		InsertionSortArray insertionSort = new InsertionSortArray();
		
		insertionSort.setTamanhoArray(quantidade);
		insertionSort.criaArrayNomes();
		insertionSort.criaArrayNotas();
		
		for (int i = 0; i < insertionSort.getTamanhoArray(); i++){
			Scanner linha = new Scanner(System.in);
			System.out.print("Digite o nome e a nota do aluno: ");
			
			String dados = linha.nextLine();
			insertionSort.setDadosParaTratar(dados);
			insertionSort.getDadosAjustaDados();
			
		}
		insertionSort.ordenaDados();				
		
		System.out.print(insertionSort.toString());
		
		quantidadeAlunos.close();
	}
}

/* 
4
Soneca 7.1
DeBoate 8.3
Vaqueira 7.6
DonoDaNet 6.8


5
Soneca 7.1
DeBoate 8.3
Vaqueira 7.6
DonoDaNet 6.8


12
Soneca 7.1
DeBoate 8.3
Vaqueira 7.6
DonoDaNet 6.8
EuSouMaisEu 10
EuMeFudn 2.4
TaNaVala 3.0
SemSalvacao 4.8
Mediano 7.6
EuQuaseLa 9.8
SeiLaMeuNome 8.4
Esperanca 6.6

*/