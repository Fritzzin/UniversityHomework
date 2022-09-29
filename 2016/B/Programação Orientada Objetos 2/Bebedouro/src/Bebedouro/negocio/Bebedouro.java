package Bebedouro.negocio;

public class Bebedouro
{
    private Reservatorio reservatorio;
    private int contadorÁguaGelada;
    private int contadorÁguaAmbiente;
    private int contadorDeConsumo;

    public Bebedouro()
    {
        this.reservatorio = new Reservatorio( 20000 );
        this.contadorÁguaGelada = 0;
        this.contadorÁguaAmbiente = 0;
        this.contadorDeConsumo = 0;
    }

    public double obterNívelDeÁgua()
    {
        return this.reservatorio.obterNívelAtual()/1000;
    }

    public void reabastecer()
    {
        this.reservatorio.abastecer(20000);
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

    public boolean servirÁguaAmbiente()
    {
        boolean sucesso = false;
        if (this.reservatorio.consumir(100))
        {
            this.contadorÁguaAmbiente ++;
            this.contadorDeConsumo ++;
            sucesso = true;
        }
        return sucesso;
    }
    
    public boolean servirÁguaGelada()
    {
        boolean sucesso = false;
        if (this.reservatorio.consumir(100))
        {
            this.contadorÁguaGelada ++;
            this.contadorDeConsumo ++;
            sucesso = true;
        }
        return sucesso;
    }

    public int obterContadorDeConsumo()
    {
        return contadorDeConsumo;
    }

    
    
    
    
    
    
}
