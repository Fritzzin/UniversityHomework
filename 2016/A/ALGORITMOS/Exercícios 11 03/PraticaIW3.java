// Augusto Fritz
public class PraticaIW3
{
    public static void main(String[] args)
    {
        int  x, y, num, soma;
        double media;
        
        x = 0;
        soma = 0;
        media = 0;
        num = 1;
        y = 0;
        while (num != 0)
        {
            num = Entrada.leiaInt("Digite o "+(x+1)+"º número:");
            
            if (num > 50 )
            {
                soma = soma + num;
            }
            else
            {
                media = media + num;
                y = y + 1;
            }
            x = x + 1;      
        }  
        System.out.println("Soma :......."+soma);
        System.out.println("Média :......"+media / (y-1));
    }
    
}

