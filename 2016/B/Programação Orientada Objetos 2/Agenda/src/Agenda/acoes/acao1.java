package Agenda.acoes;

import Agenda.Negocio.Compromisso;
import Agenda.Negocio.Data;
import pilar.Entrada;
import pilar.menu2.MenuItemAction;

public class acao1 implements MenuItemAction
{

    @Override
    public void executar()
    {
        String dt = Entrada.leiaString("Data");
        String desc = Entrada.leiaString("Descrição");

        Compromisso c = new Compromisso(new Data(dt), desc);
        vet[total] = c;
        total++;
    }

}
