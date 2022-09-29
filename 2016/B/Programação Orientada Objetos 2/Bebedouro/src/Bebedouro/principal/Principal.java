package Bebedouro.principal;


import Bebedouro.negocio.Bebedouro;
import bebedouro.apresentacao.MenuBebedouro;
import bebedouro.apresentacao.TelaBebedouro;


public class Principal
{

    public static void main(String[] args)
    {
        Bebedouro b = new Bebedouro();
        
        TelaBebedouro tela = new TelaBebedouro(b);
        tela.exibir();
    }

}
