package Bebedouro.negocio;


public class Reservatorio
{

    private double capacidade;
    private double nívelAtual;

    public Reservatorio(double capacidade)
    {
        this.capacidade = capacidade;
        this.nívelAtual = 0;
    }

    public double obterCapacidade()
    {
        return capacidade;
    }

    public void definirCapacidade(double capacidade)
    {
        this.capacidade = capacidade;
    }

    public double obterNívelAtual()
    {
        return nívelAtual;
    }

    public void abastecer(double quantidade)
    {
        this.nívelAtual = Math.min( capacidade, nívelAtual + quantidade);
    }
    
    public boolean consumir(double quantidade)
    {
        boolean ok = false;
        if (nívelAtual - quantidade >= 0)
        {
            nívelAtual -= quantidade;
            ok = true;
        }
        return ok;
    }
    
    
    
    
    
    
    
}
