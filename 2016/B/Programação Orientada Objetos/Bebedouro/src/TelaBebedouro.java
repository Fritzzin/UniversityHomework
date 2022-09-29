public class TelaBebedouro
{
    private Bebedouro bebedouro;

    public TelaBebedouro(Bebedouro bebedouro)
    {
        this.bebedouro = bebedouro;
    }

    public Bebedouro obterBebedouro()
    {
        return bebedouro;
    }

    public void definirBebedouro(Bebedouro bebedouro)
    {
        this.bebedouro = bebedouro;
    }
    
    public void exibir()
    {
        String menu = "1) Beber água natural\n"+
                "2) Beber água gelada\n"+
                "3) Reabastecer\n"+
                "4) Reinicializar Contadores\n"+
                "5) Consultar histórico\n"+
                "6) Sair";
        
        char op = ' ';
        while (op != '6')
        {
            op = Entrada.leiaChar(menu);
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
                System.out.println("Nível de água..............: "+bebedouro.obterNívelDeÁgua()+" litros");
                System.out.println("Contador de água gelada....: "+bebedouro.obterContadorÁguaGelada());
                System.out.println("Contador de água natural...: "+bebedouro.obterContadorÁguaAmbiente());
                System.out.println("Contador geral de consumo..: "+bebedouro.obterContadorDeConsumo());
                System.out.println("Água total servida.........: "+bebedouro.obterContadorDeConsumo()*0.1+" litros");
            }
        }
    }
}
