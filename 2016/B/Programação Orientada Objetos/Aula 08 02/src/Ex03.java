
/**
 *
 * @author Augus
 */
public class Ex03
{

    public static void main(String[] args)
    {
        Carro[] x = new Carro[5];
        for (int i = 0; i < 5; i++)
        {
            x[i] = new Carro();
            x[i].placa = Entrada.leiaString("Placa:");
            x[i].ano = Entrada.leiaInt("Ano:");
            System.out.println(x[i].obterImposto());
        }
    }
}
