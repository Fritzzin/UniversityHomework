
/**
 *
 * @author augusto.fritz
 */
public class Cilindro
{

    double raio;
    double altura;

    public double obterAreaBase()
    {
        return (Math.PI * Math.pow(raio, 2));
    }

    public double obterAreaLateral()
    {
        return (2 * Math.PI * raio * altura);
    }

    public double obterAreaTotal()
    {
        return (obterAreaLateral() + (2 * obterAreaBase()));
    }

    public double obterVolume()
    {
        return (obterAreaBase() * altura);
    }
}
