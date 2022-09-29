package cafeteira.apresentacao;

import cafeteira.negocio.Cafeteira;
import pilar.Entrada;
import pilar.menu2.Menu;
import pilar.menu2.MenuItem;
import pilar.menu2.MenuItemAction;

public class TelaPrincipal
{

    private Cafeteira cafeteira;

    public TelaPrincipal(Cafeteira cafeteira)
    {
        this.cafeteira = cafeteira;
    }

    public void exibir()
    {
        Menu m = new Menu();
        m.adicionar(new MenuItem('1', "Administrador", new MenuItemAction()
        {
            @Override
            public void executar()
            {
                TelaAdmin admin = new TelaAdmin(cafeteira);
                admin.exibir();
            }
        }));
        m.adicionar(new MenuItem('2', "Usuário", new MenuItemAction()
        {
            @Override
            public void executar()
            {
                TelaUsuário usu = new TelaUsuário(cafeteira);
                usu.exibir();
            }
        }));
        m.adicionar(new MenuItem('3', "Desligar o sistema", new MenuItemAction()
        {
            @Override
            public void executar()
            {
                System.exit(0);
            }
        }));
        m.gerar();

    }
}
