
/**
 *
 * @author augusto.fritz
 */
public class Data
{

    private int dia;
    private int mes;
    private int ano;

    public Data()
    {
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }

    public int getDia()
    {
        return dia;
    }

    public void setDia(int dia)
    {
        if (dia > 0 && dia <= 31)
        {
            this.dia = dia;
        }
    }

    public int getMes()
    {
        return mes;

    }

    public void setMes(int mes)
    {
        if (mes > 0 && mes <= 12)
        {
            this.mes = mes;
        }
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        if (ano > 0)
        {
            this.ano = ano;
        }
    }

    public boolean validarData()
    {
        boolean ok = false;
        int[] dmax =
        {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        if (this.ano > 0)
        {
            if (this.ano % 400 == 0 || (this.ano % 4 == 0 && this.ano % 100 != 0))
            {
                dmax[1] = 29;
            }
            if (this.mes >= 1 && this.mes <= 12)
            {
                if (this.dia >= 1 && this.dia <= dmax[this.mes - 1])
                {
                    ok = true;
                }
            }
        }
        return ok;
    }
}
