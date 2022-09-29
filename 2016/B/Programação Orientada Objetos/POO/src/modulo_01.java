/**
 *
 * @author augusto.fritz
 */
public class modulo_01
{

    public static void main(String[] args)
    {
        int n = Entrada.leiaInt("Digite um número:");
        System.out.println("Fatorial do número " + n + " = " + fatorial(n));
    }

    public static int fatorial(int n)
    {
        int fatorial = n;
        for (int i = (n - 1); i > 0; i--)
        {
            fatorial *= i;
        }
        return fatorial;
    }
}
