package reforço2;

import pilar.menu2.Menu;
import pilar.menu2.MenuItem;
import reforço2.acoes.acao1;
import reforço2.acoes.acao2;

public class Principal
{

    public static void main(String[] args)
    {
        Menu menu = new Menu();
        menu.adicionar(new MenuItem('1', "Calcular o Quadrante de um ângulo", new acao1()));
        menu.adicionar(new MenuItem('2', "Fechar o programa", new acao2()));
        menu.gerar();

    }
}
