
/**
 *
 * @author augusto.fritz
 */
public class Ponto
{

    double x[] = new double[10];
    double y[] = new double[10];

    public double[] obterDistancia()
    {
        double[] resultado = new double[10];
        for (int c = 0; c < 9; c++)
        {
          resultado[c] = Math.sqrt((Math.pow((x[c + 1] - x[c]), 2) + (Math.pow((y[c + 1] - y[c]), 2))));
        }
        return resultado;
    }
}
