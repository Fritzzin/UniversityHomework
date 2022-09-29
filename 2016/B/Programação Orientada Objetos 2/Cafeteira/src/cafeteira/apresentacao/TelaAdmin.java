package cafeteira.apresentacao;

import cafeteira.negocio.Cafeteira;
import pilar.menu2.Menu;
import pilar.menu2.MenuItem;
import pilar.menu2.MenuItemAction;

public class TelaAdmin
{

    private Cafeteira cafeteira;

    public TelaAdmin(Cafeteira cafeteira)
    {
        this.cafeteira = cafeteira;
    }

    public void exibir()
    {
        Menu m = new Menu();
        m.adicionar(new MenuItem('1', "Reabastecer", new MenuItemAction()
        {
            @Override
            public void executar()
            {
                cafeteira.abastecerCafé();
                cafeteira.abastecerCapuccino();
                cafeteira.abastecerChocolate();
                cafeteira.abastecerÁgua();
            }
        }));
        m.adicionar(new MenuItem('2', "Exibir situação", new MenuItemAction()
        {
            @Override
            public void executar()
            {
                System.out.println("Nível água................: " + cafeteira.getNívelÁgua());
                System.out.println("Nível mistura capuccino...: " + cafeteira.getNívelCapuccino());
                System.out.println("Nível mistura café........: " + cafeteira.getNívelCafé());
                System.out.println("Nível mistura chocolate...: " + cafeteira.getNívelChocolate());
                System.out.println("Número doses servidas.....: " + cafeteira.getContador());
            }
        }));
        m.adicionar(new MenuItem('3', "Reinicializar", new MenuItemAction()
        {
            @Override
            public void executar()
            {
                cafeteira.reinizializarContador();
                System.out.println("Reinicializado com sucesso");
            }
        }));
        m.adicionar(new MenuItem('4', "Voltar para o meunu anterior", new MenuItemAction()
        {
            @Override
            public void executar()
            {

            }
        }));
        m.gerar();
    }
}
