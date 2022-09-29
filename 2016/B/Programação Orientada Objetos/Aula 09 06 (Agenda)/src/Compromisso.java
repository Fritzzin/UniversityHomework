
/**
 *
 * @author augusto.fritz
 */
public class Compromisso
{

    private Data data;
    private int horas;
    private int minutos;
    private String info;
    private String local;

    public Compromisso(Data data)
    {
        this.data = data;
        this.horas = 0;
        this.minutos = 0;
        this.info = "";
        this.local = "";
    }

    public Data getData()
    {
        return data;
    }

    public void setData(Data data)
    {
        this.data = data;
    }

    public int getHoras()
    {
        return horas;
    }

    public void setHoras(int horas)
    {
        this.horas = horas;
    }

    public int getMinutos()
    {
        return minutos;
    }

    public void setMinutos(int minutos)
    {
        this.minutos = minutos;
    }

    public String getInfo()
    {
        return info;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }

    public String getLocal()
    {
        return local;
    }

    public void setLocal(String local)
    {
        this.local = local;
    }
}