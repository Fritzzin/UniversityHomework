
/**
 *
 * @author Augus
 */
public class Carro
{

    String placa;
    int ano;

    public String obterImposto()
    {
        int x;
        String nada = "";
        if (ano > 2012)
        {
            System.out.println("Ano não pode ser maior que 2012");
            return nada;
        }
        if (ano < 2012)
        {
            x = 2012 - ano;
        } else
        {
            x = 0;
        }
        int imposto = 500 - (100 * x);
        
        for (int i = 0; i < 10; i++)
        {
            x++;
            ano = 2012 + i;
            if (x < 10)
            {
                if (imposto > 100 && i!=0)
                {
                    imposto -= 100;
                }
            } else
            {
                imposto = 0;
            }
            System.out.println("Placa: "+placa+"   Ano: "+ano+"   Imposto:"+imposto);
        }
        return nada;
    }
}

