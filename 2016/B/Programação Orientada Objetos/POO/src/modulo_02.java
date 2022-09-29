
/**
 *
 * @author augusto.fritz
 */
public class modulo_02
{

    public static void main(String[] args)
    {
        int n = Entrada.leiaInt("Digite um número:");
        boolean verificador = verificar_primo(n);
        if (verificador == true)
        {
            System.out.println("O número "+n+" é um número primo.");
        }
        else
        {
            System.out.println("O número "+n+" não é um número primo.");
        }
    }
    
    public static boolean verificar_primo(int n)
    {
        boolean primo = true;
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                primo = false;
            }
        }
        return primo;
    }
}
