package fabricacasas;


import fabricaCasas2.negocio.Casa;
import fabricaCasas2.negocio.Simulador;
import fabricaCasas2.negocio.Tinta;
import fabricaCasas2.apresentacao.TelaDoSistema;


public class Principal
{

    public static void main(String[] args)
    {
        Casa casa = new Casa(0.8, 1, 1.5, 0.1, 30);
        Tinta tinta = new Tinta(3.6, 110, 25);
        Simulador sim = new Simulador(casa,tinta,1000);

        TelaDoSistema tela = new TelaDoSistema(sim);
        tela.exibir();
        
        System.exit(0);

        
        
    }
}
