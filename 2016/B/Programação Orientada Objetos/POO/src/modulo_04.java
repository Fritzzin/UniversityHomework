
/**
 *
 * @author augusto.fritz
 */
public class modulo_04
{

    public static void main(String[] args)
    {
        int tamanho1 = Entrada.leiaInt("Tamanho da 1º sequência:");
        int tamanho2 = Entrada.leiaInt("Tamanho da 2º sequência:");
        if (tamanho1 > tamanho2)
        {
            int[] n1 = new int[tamanho1];
            int[] n2 = new int[tamanho2];

            for (int i = 0; i < tamanho1; i++)
            {
                n1[i] = Entrada.leiaInt("Digite o " + (i + 1) + "º número da 1º coluna:");
            }
            for (int i = 0; i < tamanho2; i++)
            {
                n2[i] = Entrada.leiaInt("Digite o " + (i + 1) + "º número da 2º coluna:");
            }
            boolean verificador = sequencia(n1, n2, tamanho1, tamanho2);
            if (verificador == true)
            {
                System.out.println("A segunda sequência está contida na primeira.");
            } else
            {
                System.out.println("A segunda sequência não está contida na primeira.");
            }
        } else
        {
            System.out.println("A 2º sequência não pode ser maior que a 1º.");
        }
    }

    public static boolean sequencia(int[] n1, int[] n2, int tamanho1, int tamanho2)
    {
        boolean x = false;
        for (int i = 0; i < tamanho2; i++)
        {
            for (int j = 0; j < tamanho1; j++)
            {
                
            }
        }
        x = true;
        return x;
    }
}
