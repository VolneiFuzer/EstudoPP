package Bubblesort;

public class Bubble_Sort 
{	
	/**
	 * Ordena um array de inteiros utilizando o algoritmo classico do
	 * BubbleSort, que consiste em iterar sobre o array empurando os maiores valores para o final. 
	 */
    public static void ordenar(int Vetor[]) 
	{   for (int i = v.length; i >= 1; i--) 
		{	for (int j = 1; j < i; j++) 
			{	if (Vetor[j - 1] > Vetor[j]) 
				{	int AUX = Vetor[j];  
                    Vetor[j] = Vetor[j - 1];  
                    Vetor[j - 1] = AUX;  
                }  
            }  
        }  
    }  
} 