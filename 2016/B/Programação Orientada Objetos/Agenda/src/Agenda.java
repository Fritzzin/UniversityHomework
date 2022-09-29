
public class Agenda
{

    private Compromisso[] vet;
    private int númeroDeCompromissos;

    public Agenda()
    {
        this.vet = new Compromisso[1000];
        this.númeroDeCompromissos = 0;
    }

    public void adicionar(Data data, String descrição)
    {
        this.vet[númeroDeCompromissos] = new Compromisso(data, descrição);
    }

    public void editar(Data data, String descrição)
    {
        this.vet[númeroDeCompromissos].setData(data);
        this.vet[númeroDeCompromissos].setDescrição(descrição);
    }

    public void excluir(int deletar)
    {
        for (int i = (deletar - 1); i < númeroDeCompromissos - 1; i++)
        {
            vet[i] = vet[i + 1];
        }
        númeroDeCompromissos--;
    }

    /*public void ordenar() //Não entendi o que era pra fazer neste
    {

    }*/

    public void obterCompromissos(Data data)
    {
        for (int i = 0; i < númeroDeCompromissos; i++)
        {
            if (vet[i].getData() == data)
            {
                System.out.println("Nº :" + (i + 1) + "\n"
                        + "Data: " + vet[i].getData() + "\n"
                        + "Descrição: " + vet[i].getDescrição());
            }
        }
    }

    public void obterCompromissos(Data dataInicial, Data dataFinal)
    {
        for (int i = 0; i < númeroDeCompromissos; i++)
        {
            boolean okA = (Math.min(dataInicial.getAno(), dataFinal.getAno()) <= vet[i].getData().getAno() && Math.max(dataInicial.getAno(), dataFinal.getAno()) >= vet[i].getData().getAno());
            boolean okB = (Math.min(dataInicial.getMes(), dataFinal.getMes()) <= vet[i].getData().getMes() && Math.max(dataInicial.getMes(), dataFinal.getMes()) >= vet[i].getData().getMes());
            boolean okC = (Math.min(dataInicial.getDia(), dataFinal.getDia()) <= vet[i].getData().getDia() && Math.max(dataInicial.getDia(), dataFinal.getDia()) >= vet[i].getData().getDia());
            if (okA && okB && okC)
            {
                System.out.println("");
                System.out.println((i + 1) + ".Data: " + vet[i].getData().getDia()
                        + "/" + vet[i].getData().getMes() + "/" + vet[i].getData().getAno()
                        + "\n  Descrição: " + vet[i].getDescrição());
            }
        }
    }

    public Compromisso[] obterCompromissos(String descriçãoParcial)
    {
        return null;
    }

}
