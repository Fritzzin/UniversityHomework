package reforço2.negocio;

public class Ponto
{

    private double angulo;

    public Ponto(double angulo)
    {
        this.angulo = angulo;
    }

    public double getAngulo()
    {
        return angulo;
    }

    public void setAngulo(double angulo)
    {
        this.angulo = angulo;
    }

    public String getQuadrante()
    {
        String x = " ";
        double y = this.getAngulo();
        if (y > 360)
        {
            while (y > 360)
            {
                y -= 360;
            }
        }
        if (y < -360)
        {
            while (y < 0)
            {
                y += 360;
            }
        }
        if (y == 0 || y == 180)
        {
            x = "Eixo dos Cossenos";
        }
        if (y == 90 || y == 270)
        {
            x = "Eixo dos Senos";
        }
        if (y > 0 && y < 90)
        {
            x = "1º Quadrante";
        }
        if (y > 90 && y < 180)
        {
            x = "2º Quadrante";
        }
        if (y > 180 && y < 270)
        {
            x = "3º Quadrante";
        }
        if (y > 270 && y < 270)
        {
            x = "4º Quadrante";
        }
        return x;
    }
}
