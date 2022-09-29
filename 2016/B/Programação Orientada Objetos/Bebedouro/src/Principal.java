
public class Principal
{

    public static void main(String[] args)
    {
        Bebedouro b = new Bebedouro();
        
        TelaBebedouro tela = new TelaBebedouro(b);
        tela.exibir();
        
        
        System.exit(0);
    }

}
