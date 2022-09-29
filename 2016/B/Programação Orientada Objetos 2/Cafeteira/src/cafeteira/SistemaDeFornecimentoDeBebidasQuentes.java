package cafeteira;

import cafeteira.negocio.Cafeteira;
import cafeteira.apresentacao.TelaPrincipal;

public class SistemaDeFornecimentoDeBebidasQuentes
{

    public static void main(String[] args)
    {
        Cafeteira c = new Cafeteira();
        TelaPrincipal t = new TelaPrincipal(c);
        t.exibir();
    }
}
