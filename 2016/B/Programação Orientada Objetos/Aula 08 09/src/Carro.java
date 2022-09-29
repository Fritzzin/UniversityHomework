
/**
 *
 * @author Augus
 */
public class Carro
{

    private String placa;
    private int ano;

    public Carro(String placa, int ano)
    {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca()
    {
        return placa;
    }

    public int getAno()
    {
        return ano;
    }

    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public String obterImposto()
    {
        int x;
        String nada = "";
        if (ano > 2016)
        {
            System.out.println("Ano não pode ser maior que 2012");
            return nada;
        }
        if (ano < 2016)
        {
            x = 2016 - ano;
        } else
        {
            x = 0;
        }
        int imposto = 500 - (100 * x);

        for (int i = 0; i < 10; i++)
        {
            x++;
            ano = 2016 + i;
            if (x < 10)
            {
                if (imposto > 100 && i != 0)
                {
                    imposto -= 100;
                }
            } else
            {
                imposto = 0;
            }
            System.out.println("Placa: " + placa + "   Ano: " + ano + "   Imposto:" + imposto);
        }
        return nada;
    }
}
