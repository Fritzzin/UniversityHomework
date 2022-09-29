// Augusto Fritz
public class PraticaIW1
{
    public static void main(String[] args)
    {
        int  x, soma;
        
        x = 0;
        soma = 0;
        
        if ( x < 3 )
        {
            System.out.println(0);
        }
        while (x < 100)
        {
            soma = soma + 2;
            
            x = x + 2;
            
            System.out.println(soma);
        }  
    }
}

