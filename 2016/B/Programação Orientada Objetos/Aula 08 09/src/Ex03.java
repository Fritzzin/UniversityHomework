
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
            String placa = Entrada.leiaString("Placa:");
            int ano = Entrada.leiaInt("Ano:");
            x[i] = new Carro(placa, ano);
            System.out.println(x[i].obterImposto());
        }
    }
}
