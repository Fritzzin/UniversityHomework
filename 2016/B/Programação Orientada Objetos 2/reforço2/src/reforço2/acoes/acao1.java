package reforço2.acoes;

import pilar.Entrada;
import pilar.menu2.MenuItemAction;
import reforço2.negocio.Ponto;

public class acao1 implements MenuItemAction
{

    @Override
    public void executar()
    {
        Ponto x = new Ponto(Entrada.leiaDouble("Digite o ângulo:"));
        System.out.println(x.getQuadrante());
    }

}
