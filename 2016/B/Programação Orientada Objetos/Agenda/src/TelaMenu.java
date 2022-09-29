public class TelaMenu
{
    private Compromisso[] vet;
    private int total;
    
    public TelaMenu(Compromisso[] vet)
    {
        this.vet = vet;
        this.total = 0;
    }

    public void exibir()
    {
        String menu = "1) Cadastrar\n"
                + "2) Deletar compromisso\n"
                + "3) Listar todos os compromissos\n"
                + "4) Listar compromissos entre duas datas\n"
                + "5) Sair";

        char op = ' ';
        while (op != '5')
        {
            op = Entrada.leiaChar(menu);
            if (op == '1')
            {
                String dt = Entrada.leiaString("Data");
                String desc = Entrada.leiaString("Descrição");
                
                Compromisso c = new Compromisso(new Data(dt), desc);
                vet[total] = c;
                total ++;
            }
            else if (op == '2')
            {
                int p = Entrada.leiaInt("Informe número do compromisso a ser deletado");
                if (p >= 1 && p <= total)
                {
                    int posição = p - 1;
                    
                    for (int i = posição; i < total-1; i++)
                    {
                        vet[i] = vet[i+1];
                    }
                    total --;
                }
            }
            else if (op == '3')
            {
                if (total > 0)
                {
                    Data dt = vet[0].getData();
                    System.out.println( "***** " + dt.getDataFormatada(1) );
                    for (int i = 0; i < total; i++)
                    {
                        if (vet[i].getData().equals(dt))
                        {
                            System.out.println( (i+1)+" -> "+vet[i].getDescrição() );
                        }
                        else
                        {
                            System.out.println("");
                            dt = vet[i].getData();
                            System.out.println( "***** " + dt.getDataFormatada(1) );
                            System.out.println( (i+1)+" -> "+vet[i].getDescrição() );
                        }
                    }
                }
            }
            else if (op == '4')
            {
                String dti = Entrada.leiaString("Data inicial");
                String dtf = Entrada.leiaString("Data final");
                
                Data dtInicial = new Data(dti);
                Data dtFinal = new Data(dtf);
                System.out.println( "Data inicial..: " + dtInicial.getDataFormatada(1) );
                System.out.println( "Data final....: " + dtFinal.getDataFormatada(1) );
                System.out.println("");
                for (int i = 0; i < total; i++)
                {
                    if (vet[i].getData().compareTo(dtInicial) >= 0 &&
                        vet[i].getData().compareTo(dtFinal) <= 0 )
                    {
                        System.out.println( (i+1)+" -> "+vet[i].getDescrição() );
                    }
                }
                
            }
        }
    }
}
