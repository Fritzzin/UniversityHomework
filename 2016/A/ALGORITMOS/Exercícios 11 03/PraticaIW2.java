// Augusto Fritz
public class PraticaIW2
{
    public static void main(String[] args)
    {
        int  x, num, somaP, somaI;
        
        x = 0;
        somaP = 0;
        somaI = 0;
        while (x < 10)
        {
            num = Entrada.leiaInt("Digite o "+(x+1)+"º número:");
            
            if (num % 2 == 0 ) //par
            {
                somaP = somaP + num;
            }
            else
            {
                somaI = somaI + num;
            }
            x = x + 1;      
        }  
        System.out.println("Soma números pares: "+somaP);
        System.out.println("Soma números ímpares: "+somaI);
    }
    
}

