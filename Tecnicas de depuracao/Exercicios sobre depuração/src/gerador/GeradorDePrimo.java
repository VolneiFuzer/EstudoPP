package gerador;
public class GeradorDePrimo 
{   private static final int PRIMEIRO_PRIMO = 2;
    private int proxPrimo = PRIMEIRO_PRIMO;
    
    public int getProxPrimo()  
    {   int primo = proxPrimo;
        proxPrimo++;
        while (isPrimo(proxPrimo))
        {   proxPrimo++; 
        }
        return primo;
    }

    private boolean isPrimo(int primo) 
    {   int qtdDivisores = 0;
        for (int i = 0; i < primo; i++) 
        {   if (primo % i == 0)
            {   qtdDivisores++;
            }
        }
        return qtdDivisores == 2;
    }    
}
