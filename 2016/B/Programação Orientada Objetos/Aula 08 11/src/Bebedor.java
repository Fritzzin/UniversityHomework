
/**
 *
 * @author augusto.fritz
 */
public class Bebedor
{

    private double reservatorio;
    private int ambiente;
    private int gelada;

    public Bebedor()
    {
        this.reservatorio = 0;
        this.ambiente = 0;
        this.gelada = 0;
    }

    public void setGelada()
    {
        if (this.reservatorio > 0)
        {
            this.gelada++;
            this.reservatorio -= 100;
        } else
        {
            System.out.println("O reservatório está vázio. Favor reabastecer.");
        }
    }

    public void setAmbiente()
    {
        if (this.reservatorio > 0)
        {
            this.ambiente++;
            this.reservatorio -= 100;
        } else
        {
            System.out.println("O reservatório está vázio. Favor reabastecer.");
        }
    }

    public int getAmbiente()
    {
        return ambiente;
    }

    public int getGelada()
    {
        return gelada;
    }

    public double getReservatorio()
    {
        return reservatorio / 1000;
    }

    public double reabastecer()
    {
        return this.reservatorio = 20000;
    }

    public String getPreferencia()
    {
        if (this.gelada > this.ambiente)
        {
            return "Gelada";
        }
        return "Ambiente";
    }
}
