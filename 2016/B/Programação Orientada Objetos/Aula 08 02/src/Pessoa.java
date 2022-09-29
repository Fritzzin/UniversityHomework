/**
 *
 * @author Augus
 */
public class Pessoa
{
    String nome;
    int idade;
    
    public int obterIdadeMeses()
    {
        return (idade*12);
    }
    
    public int obterIdade50()
    {
        return (idade + (2050-2016));
    }
}
