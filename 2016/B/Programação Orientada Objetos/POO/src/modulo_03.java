
/**
 *
 * @author augusto.fritz
 */
public class modulo_03
{

    public static void main(String[] args)
    {
        int n1 = Entrada.leiaInt("Digite o 1º número:");
        int n2 = Entrada.leiaInt("Digite o 2º número:");

        boolean verificador = coprimos(n1, n2);

        if (verificador)
        {
            System.out.println("Os números " + n1 + " e " + n2 + " são primos relativos");
        } else
        {
            System.out.println("Os números " + n1 + " e " + n2 + " não são primos relativos");
        }
    }

    public static boolean coprimos(int n1, int n2)
    {
        boolean primo = true;
        int cont = 1;
        int menor = n1;
        if (n1 > n2)
        {
            menor = n2;
        }
        for (int i = 2; i < menor; i++)
        {
            if ((n1 % i == 0) && (n2 % i == 0))
            {
                cont++;
            }
        }
        if (cont > 1)
        {
            primo = false;                   
        }
        return primo;
    }
}
