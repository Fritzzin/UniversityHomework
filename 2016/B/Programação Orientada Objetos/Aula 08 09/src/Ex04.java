
/**
 *
 * @author Augus
 */
public class Ex04
{

    public static void main(String[] args)
    {
        String nome = Entrada.leiaString("Nome:");
        int idade = Entrada.leiaInt("Idade:");
        Pessoa x = new Pessoa(nome, idade);

        System.out.println("Idade do(a)" + x.getNome() + " em mêses: " + x.obterIdadeMeses());
        System.out.println("Idade do(a)" + x.getNome() + " em 2050: " + x.obterIdade50());
    }
}
