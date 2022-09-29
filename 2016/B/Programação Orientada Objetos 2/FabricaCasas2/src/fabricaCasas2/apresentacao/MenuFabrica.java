
package fabricaCasas2.apresentacao;

import fabricaCasas2.negocio.Casa;
import fabricaCasas2.negocio.Simulador;
import fabricaCasas2.negocio.Tinta;
import pilar.Entrada;
import pilar.menu.MenuModel;


public class MenuFabrica implements MenuModel
{
    private Casa casa;
    private Simulador sim;

    public MenuFabrica(Casa casa, Simulador sim)
    {
        this.casa = casa;
        this.sim = sim;
    }
    
    @Override
    public void executar(char op)
    {
        if (op == '1')
            {
                double f = Entrada.leiaDouble("Frente:");
                double p = Entrada.leiaDouble("Profundidade:");
                double a = Entrada.leiaDouble("Altura:");
                double i = Entrada.leiaDouble("Inclinação telhado:");
                sim.getCasa().setFrente(f);
                sim.getCasa().setAltura(a);
                sim.getCasa().setProfundidade(p);
                sim.getCasa().setGrauInclinaçãoTelhado(i);
            }
            else if (op == '2')
            {
                double t = Entrada.leiaDouble("Tamanho embalagem em litros:");
                double p = Entrada.leiaDouble("Preço da embalagem:");
                double c = Entrada.leiaDouble("Cobertura por litro:");
                Tinta tinta = sim.getTinta();
                tinta.setCoberturaPorLitro(c);
                tinta.setPreçoPorEmbalagem(p);
                tinta.setQuantidadePorEmbalagem(t);
            }
            else if (op == '3')
            {
                int t = Entrada.leiaInt("Tamanho do lote:");
                sim.setTamanhoLote(t);
                System.out.println("Quantidade de embalagens necessárias: "+sim.getQuantidadeDeEmbalagensDeTinta());
                System.out.println("Valor total do lote: "+sim.getValorDoLote());
            }
    }
    
}
