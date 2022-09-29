
/**
 *
 * @author Augus
 */
public class NumeroInteiro
{

    int numero;

    public int obterFatorial()
    {
        int fatorial = numero;
        for (int i = (numero - 1); i > 0; i--)
        {
            fatorial *= i;
        }
        return fatorial;
    }

    public boolean éPrimo()
    {
        boolean primo = true;
        for (int i = 2; i < numero; i++)
        {
            if (numero % i == 0)
            {
                primo = false;
            }
        }
        return primo;
    }

    public boolean éPrimoRelativoDe(int n)
    {
        boolean primoRelativo = true;
        int menor = Math.min(numero, n);
        for (int i = 2; i <= menor && primoRelativo; i++)
        {
            if (numero % i == 0 && n % i == 0)
            {
                primoRelativo = false;
            }
        }
        return primoRelativo;
    }
}
