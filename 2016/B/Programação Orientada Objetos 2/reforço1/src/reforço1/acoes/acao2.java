package reforço1.acoes;

import pilar.Entrada;
import pilar.menu2.MenuItemAction;
import reforço1.negocio.Ponto;

public class acao2 implements MenuItemAction
{

    @Override
    public void executar()
    {
        int x1 = Entrada.leiaInt("Digite o valor do 1º X");
        int y1 = Entrada.leiaInt("Digite o valor do 1º Y");
        int x2 = Entrada.leiaInt("Digite o valor do 2º X");
        int y2 = Entrada.leiaInt("Digite o valor do 2º Y");
        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);
        System.out.println("Distância entre os dois pontos é de " + p1.getDistancia(p2));
    }
}
