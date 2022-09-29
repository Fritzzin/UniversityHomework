/**
 *
 * @author augusto.fritz
 */
public class Ex01
{
    public static void main(String[] args)
    {
        Cilindro x = new Cilindro();
        x.altura = Entrada.leiaDouble("Altura:");
        x.raio = Entrada.leiaDouble("Raio:");
        
        System.out.println("Volume: "+x.obterVolume());
    }
}
