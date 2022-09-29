
public class Bebedouro
{

    private Reservatorio nívelDeÁgua;
    private int contadorÁguaGelada;
    private int contadorÁguaAmbiente;
    private int contadorDeConsumo;

    public Bebedouro(Reservatorio r)
    {
        r.getNívelDeÁgua();
        this.contadorÁguaGelada = 0;
        this.contadorÁguaAmbiente = 0;
        this.contadorDeConsumo = 0;
    }

    public double obterNívelDeÁgua(Reservatorio r)
    {
        return r.getNívelDeÁgua() / 1000;
    }

    public void reabastecer(Reservatorio r)
    {
        r.reabastecer();
    }

    public int obterContadorÁguaGelada()
    {
        return contadorÁguaGelada;
    }

    public void reiniciarContadoresParciais()
    {
        this.contadorÁguaGelada = 0;
        this.contadorÁguaAmbiente = 0;
    }

    public int obterContadorÁguaAmbiente()
    {
        return contadorÁguaAmbiente;
    }

    public boolean servirÁguaAmbiente(Reservatorio r)
    {
        boolean sucesso = false;
        if (r.getNívelDeÁgua() >= 100)
        {
            this.contadorÁguaAmbiente++;
            this.contadorDeConsumo++;
            r.setNívelDeÁgua();
            sucesso = true;
        }
        return sucesso;
    }

    public boolean servirÁguaGelada(Reservatorio r)
    {
        
        boolean sucesso = false;
        if (r.getNívelDeÁgua() >= 100)
        {
            this.contadorÁguaGelada++;
            this.contadorDeConsumo++;
            r.setNívelDeÁgua();
            sucesso = true;
        }
        return sucesso;
    }

    public int obterContadorDeConsumo()
    {
        return contadorDeConsumo;
    }

}
