package fabricaCasas2.negocio;

public class Casa
{
    private double altura;
    private double frente;
    private double profundidade;
    private double tamanhoAba;
    private double grauInclinaçãoTelhado;

    public Casa(double altura, double frente, double profundidade, double tamanhoAba, double grauInclinaçãoTelhado)
    {
        this.altura = altura;
        this.frente = frente;
        this.profundidade = profundidade;
        this.tamanhoAba = tamanhoAba;
        this.grauInclinaçãoTelhado = grauInclinaçãoTelhado;
    }

    public double getGrauInclinaçãoTelhado()
    {
        return grauInclinaçãoTelhado;
    }

    public void setGrauInclinaçãoTelhado(double grauInclinaçãoTelhado)
    {
        this.grauInclinaçãoTelhado = grauInclinaçãoTelhado;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getFrente()
    {
        return frente;
    }

    public void setFrente(double frente)
    {
        this.frente = frente;
    }

    public double getProfundidade()
    {
        return profundidade;
    }

    public void setProfundidade(double profundidade)
    {
        this.profundidade = profundidade;
    }

    public double getTamanhoAba()
    {
        return tamanhoAba;
    }

    public void setTamanhoAba(double tamanhoAba)
    {
        this.tamanhoAba = tamanhoAba;
    }
    
    public double getAreaDasParedes()
    {
        double a1 = this.altura*this.frente;
        double a2 = this.altura*this.profundidade;
        
        //sen(x) = co/h;
        //tag(x) = co/ca;
        double inclinação = grauInclinaçãoTelhado * Math.PI / 180; // radianos
        double ca = frente / 2;
        double co = ca * Math.tan( inclinação );
        
        double a3 = this.frente * co/2;
        
        return (a1+a2+a3)*2;
    }
    
}
