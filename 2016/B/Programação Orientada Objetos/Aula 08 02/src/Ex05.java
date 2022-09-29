/**
 *
 * @author Augus
 */
public class Ex05
{
    public static void main(String[] args)
    {
        NumeroInteiro x = new NumeroInteiro();
        x.numero = Entrada.leiaInt("Número inteiro:");
        int n = Entrada.leiaInt("Número para verificar o relativo:");
        System.out.println("Fatorial: "+x.obterFatorial());
        System.out.println("Primo: "+x.éPrimo());
        System.out.println("Primo Relativo de: "+x.éPrimoRelativoDe(n));
    }
}
