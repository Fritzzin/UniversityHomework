package fabricaCasas2.apresentacao;

import fabricaCasas2.negocio.Tinta;
import fabricaCasas2.negocio.Simulador;

public class TelaDoSistema
{

    private Simulador sim;

    public TelaDoSistema(Simulador sim)
    {
        this.sim = sim;
    }

    public Simulador getSim()
    {
        return sim;
    }

    public void setSim(Simulador sim)
    {
        this.sim = sim;
    }

    public void exibir()
    {
        char[] atalhos =
        {
            '1', '2', '3', '4'
        };
        String[] descr =
        {
            "Definir casa",
            "Definir tinta",
            "Simular",
            "Sair"
        };
        MenuFabrica m = new MenuFabrica();
        char op = ' ';
        while (op != '4')
        {
            op = Entrada.leiaChar(menu);

        }
    }

}
