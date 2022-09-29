package bebedouro.apresentacao;

import pilar.menu.MenuModel;
import Bebedouro.negocio.Bebedouro;

public class MenuBebedouro implements MenuModel
{

    private Bebedouro bebedouro;

    public MenuBebedouro(Bebedouro bebedouro)
    {
        this.bebedouro = bebedouro;
    }
    

    @Override
    public void executar(char op)
    {
        if (op == '1')
        {
            if (bebedouro.servirÁguaAmbiente())
            {
                System.out.println("Água servida com sucesso");
            }
            else
            {
                System.out.println("Nível insuficiente de água no reservatório");
            }
        }
        else if (op == '2')
        {
            if (bebedouro.servirÁguaGelada())
            {
                System.out.println("Água servida com sucesso");
            }
            else
            {
                System.out.println("Nível insuficiente de água no reservatório");
            }
        }
        else if (op == '3')
        {
            bebedouro.reabastecer();
        }
        else if (op == '4')
        {
            bebedouro.reiniciarContadoresParciais();
        }
        else if (op == '5')
        {
            System.out.println("Nível de água..............: " + bebedouro.obterNívelDeÁgua() + " litros");
            System.out.println("Contador de água gelada....: " + bebedouro.obterContadorÁguaGelada());
            System.out.println("Contador de água natural...: " + bebedouro.obterContadorÁguaAmbiente());
            System.out.println("Contador geral de consumo..: " + bebedouro.obterContadorDeConsumo());
            System.out.println("Água total servida.........: " + bebedouro.obterContadorDeConsumo() * 0.1 + " litros");
        }
    }

}
