package fabricaCasas2.negocio;

public class Tinta
{
    private double quantidadePorEmbalagem;
    private double preçoPorEmbalagem;
    private double coberturaPorLitro;

    public Tinta(double quantidadePorEmbalagem, double preçoPorEmbalagem, double coberturaPorLitro)
    {
        this.quantidadePorEmbalagem = quantidadePorEmbalagem;
        this.preçoPorEmbalagem = preçoPorEmbalagem;
        this.coberturaPorLitro = coberturaPorLitro;
    }

    public double getCoberturaPorLitro()
    {
        return coberturaPorLitro;
    }
    
    public double getCoberturaPorEmbalagem()
    {
        return coberturaPorLitro*quantidadePorEmbalagem;
    }

    public void setCoberturaPorLitro(double coberturaPorLitro)
    {
        this.coberturaPorLitro = coberturaPorLitro;
    }

    public double getQuantidadePorEmbalagem()
    {
        return quantidadePorEmbalagem;
    }

    public void setQuantidadePorEmbalagem(double quantidadePorEmbalagem)
    {
        this.quantidadePorEmbalagem = quantidadePorEmbalagem;
    }

    public double getPreçoPorEmbalagem()
    {
        return preçoPorEmbalagem;
    }

    public void setPreçoPorEmbalagem(double preçoPorEmbalagem)
    {
        this.preçoPorEmbalagem = preçoPorEmbalagem;
    }
    
    
}
