package bebedouro.apresentacao;

import Bebedouro.negocio.Bebedouro;
import pilar.Entrada;
import pilar.menu.Menu;
import pilar.menu.MenuModel;

public class TelaBebedouro
{
    private Bebedouro bebedouro;

    public TelaBebedouro(Bebedouro bebedouro)
    {
        this.bebedouro = bebedouro;
    }

    public Bebedouro obterBebedouro()
    {
        return bebedouro;
    }

    public void definirBebedouro(Bebedouro bebedouro)
    {
        this.bebedouro = bebedouro;
    }

    public void exibir()
    {
        char[] atalhos ={'1', '2', '3', '4', '5', '6'};
        String[] descricao ={
            "Beber água natural",
            "Beber água gelada",
            "Reabastecer",
            "Reinicializar Contadores",
            "Consultar histórico",
            "Sair"
        };
        MenuBebedouro m = new MenuBebedouro(bebedouro);
        new Menu(atalhos,descricao,m).exibir();

       
    }
}
