
import Agenda.Negocio.Compromisso;
import pilar.menu2.Menu;
import pilar.menu2.MenuItem;

public class Principal
{

    public static void main(String[] args)
    {
        Compromisso[] v = new Compromisso[1000];
        int total = 0;

        Menu menu = new Menu();
        menu.adicionar(new MenuItem('1', "Cadastrar", new acao1()));
        menu.adicionar(new MenuItem('2', "Deletar compromisso", new acao2()));
        menu.adicionar(new MenuItem('3', "Listar todos os compromissos", new acao3()));
        menu.adicionar(new MenuItem('4', "Listar compromissos entre duas datas", new acao4()));
        menu.adicionar(new MenuItem('5', "Saira", new acao5()));
        menu.gerar();
    }
}
