
/**
 *
 * @author Augus
 */
public class Ex04
{

    public static void main(String[] args)
    {
        Pessoa x = new Pessoa();
        x.nome = Entrada.leiaString("Nome:");
        x.idade = Entrada.leiaInt("Idade:");

        
        System.out.println("Idade do(a)"+x.nome+" em mêses: "+x.obterIdadeMeses());
        System.out.println("Idade do(a)"+x.nome+" em 2050: "+x.obterIdade50());
    }
}
