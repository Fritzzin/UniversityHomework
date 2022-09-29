package reforço1;

import pilar.menu2.Menu;
import pilar.menu2.MenuItem;
import reforço1.acoes.acao1;
import reforço1.acoes.acao2;
import reforço1.acoes.acao3;

public class Principal
{

    public static void main(String[] args)
    {
        Menu menu = new Menu();
        menu.adicionar(new MenuItem('1', "Calcular o Quadrante de um ponto", new acao1()));
        menu.adicionar(new MenuItem('2', "Calcular a distância entre doius pontos", new acao2()));
        menu.adicionar(new MenuItem('3', "Fechar o programa", new acao3()));
        menu.gerar();

    }
}
