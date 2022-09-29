
/**
 *
 * @author augusto.fritz
 */
public class Ex02
{

    public static void main(String[] args)
    {
        Cilindro[] x = new Cilindro[5];
        double soma = 0;

        for (int i = 0; i < 5; i++)
        {
            x[i] = new Cilindro();
            x[i].altura = Entrada.leiaDouble((i + 1) + "ª Altura:");
            x[i].raio = Entrada.leiaDouble((i + 1) + "º Raio:");
        }

        for (int i = 0; i < 5; i++)
        {
            soma += x[i].obterAreaTotal();
        }

        System.out.println("Soma das 5 áreas totais = " + soma);
    }
}
