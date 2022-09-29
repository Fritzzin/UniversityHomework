
/**
 *
 * @author augusto.fritz
 */
public class Cilindro
{

    private double raio;
    private double altura;

    public Cilindro(double raio, double altura)
    {
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio()
    {
        return raio;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setRaio(double raio)
    {
        this.raio = raio;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

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
