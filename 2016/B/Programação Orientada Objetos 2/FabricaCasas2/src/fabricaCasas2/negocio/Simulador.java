package fabricaCasas2.negocio;

public class Simulador
{
    private Casa casa;
    private Tinta tinta;
    private int tamanhoLote;
    private int demãos;

    public Simulador(Casa casa, Tinta tinta, int tamanhoLote)
    {
        this.casa = casa;
        this.tinta = tinta;
        this.tamanhoLote = tamanhoLote;
        this.demãos = 2;
    }

    public Casa getCasa()
    {
        return casa;
    }

    public void setCasa(Casa casa)
    {
        this.casa = casa;
    }

    public Tinta getTinta()
    {
        return tinta;
    }

    public void setTinta(Tinta tinta)
    {
        this.tinta = tinta;
    }

    public int getTamanhoLote()
    {
        return tamanhoLote;
    }

    public void setTamanhoLote(int tamanhoLote)
    {
        this.tamanhoLote = tamanhoLote;
    }

    public int getQuantidadeDeEmbalagensDeTinta()
    {
        return (int)Math.ceil((casa.getAreaDasParedes() * this.tamanhoLote / tinta.getCoberturaPorEmbalagem()) * demãos);
    }
    
    public double getValorDoLote()
    {
        return this.getQuantidadeDeEmbalagensDeTinta() * this.tinta.getPreçoPorEmbalagem();
    }

    public int getDemãos()
    {
        return demãos;
    }

    public void setDemãos(int demãos)
    {
        this.demãos = demãos;
    }
    
    
}
