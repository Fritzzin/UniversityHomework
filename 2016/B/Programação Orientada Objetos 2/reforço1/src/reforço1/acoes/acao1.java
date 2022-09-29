package reforço1.acoes;

import pilar.Entrada;
import pilar.menu2.MenuItemAction;
import reforço1.negocio.Ponto;

public class acao1 implements MenuItemAction
{

    @Override
    public void executar()
    {
        int x = Entrada.leiaInt("Digite o valor de X");
        int y = Entrada.leiaInt("Digite o valor de Y");
        Ponto p = new Ponto(x, y);
        System.out.println(p.getQuadrante());
    }
}
