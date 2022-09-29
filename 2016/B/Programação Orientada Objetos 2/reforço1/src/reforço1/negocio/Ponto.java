package reforço1.negocio;

public class Ponto
{

    private double x;
    private double y;

    public Ponto(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getDistancia(Ponto p)
    {
        return (Math.sqrt(Math.pow(p.getX() - this.getX(), 2) + Math.pow(p.getY() - this.getY(), 2)));
    }

    public String getQuadrante()
    {
        String x = " ";
        if (this.x > 0 && this.y > 0)
        {
            x = "1º Quadrante";
        }
        if (this.x < 0 && this.y > 0)
        {
            x = "2º Quadrante";
        }
        if (this.x < 0 && this.y < 0)
        {
            x = "3º Quadrante";
        }
        if (this.x > 0 && this.y < 0)
        {
            x = "4º Quadrante";
        }
        if (this.x == 0)
        {
            x = "Eixo dos Senos";
        }
        if (this.y == 0)
        {
            x = "Eixo dos Cossenos";
        }
        return x;
    }
}
