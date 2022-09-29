package cafeteira.apresentacao;

import cafeteira.negocio.Cafeteira;
import pilar.menu2.Menu;
import pilar.menu2.MenuItem;
import pilar.menu2.MenuItemAction;

public class TelaUsuário
{

    Cafeteira cafeteira;

    public TelaUsuário(Cafeteira cafeteira)
    {
        this.cafeteira = cafeteira;
    }

    public void exibir()
    {
        Menu m = new Menu();
        m.adicionar(new MenuItem('1', "Servir Capuccino", new MenuItemAction()
        {
            @Override
            public void executar()
            {
                if (cafeteira.servirCapuccino())
                {
                    System.out.println("Capuccino servido com sucesso");
                }
                else
                {
                    System.out.println("Faltou insumos");
                }
            }
        }));
        m.adicionar(new MenuItem('2', "Servir Café", new MenuItemAction()
        {
            @Override
            public void executar()
            {
                if (cafeteira.servirCafé())
                {
                    System.out.println("Café servido com sucesso");
                }
                else
                {
                    System.out.println("Faltou insumos");
                }
            }
        }));
        m.adicionar(new MenuItem('3', "Servir Chocolate", new MenuItemAction()
        {
            @Override
            public void executar()
            {
                if (cafeteira.servirChocolate())
                {
                    System.out.println("Chocolate servido com sucesso");
                }
                else
                {
                    System.out.println("Faltou insumos");
                }
            }
        }));
        m.adicionar(new MenuItem('4', "Voltar para o menu anterior", new MenuItemAction()
        {
            @Override
            public void executar()
            {
                
            }
        }));
        m.gerar();
    }
}
