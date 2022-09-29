public class Movimento
{
    private Data data;
    private String operação;
    private double valor;
   // private char tipo; //D ou C

    public Movimento(Data data, String operação, double valor)
    {
        this.data = data;
        this.operação = operação;
        this.valor = valor;
        //this.tipo = tipo;
    }

    /*public char getTipo()
    {
        return tipo;
    }

    public void setTipo(char tipo)
    {
        this.tipo = tipo;
    }*/

    public Data getData()
    {
        return data;
    }

    public void setData(Data data)
    {
        this.data = data;
    }

    public String getOperação()
    {
        return operação;
    }

    public void setOperação(String operação)
    {
        this.operação = operação;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }
}
