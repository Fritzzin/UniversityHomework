
/**
 *
 * @author augusto.fritz
 */
public class Ex01
{

    public static void main(String[] args)
    {
        double raio = Entrada.leiaDouble("Raio:");
        double altura = Entrada.leiaDouble("Altura:");
        Cilindro x = new Cilindro(raio, altura);
        System.out.println("Volume: " + x.obterVolume());
    }
}
