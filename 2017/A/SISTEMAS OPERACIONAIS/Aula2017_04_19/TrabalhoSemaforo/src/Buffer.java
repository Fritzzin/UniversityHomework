
//estrutura da classe buffer
public class Buffer
{

    public Buffer()
    {
        qtde = 0;
        entrada = 0;
        saida = 0;

        buffer = new Object[TAMANHO_BUFFER];

        mutex = new Semaforo(1);
        empty = new Semaforo(10);
        full = new Semaforo(0);
    }

// metodo executado pelo produtor
    public void produz(Object item, String nome) throws InterruptedException
    {
        empty.P("Empty",nome);
        mutex.P("Mutex",nome);

        qtde++;
        buffer[entrada] = item;
        System.out.println(nome + " - " +"Produz posicao: " + entrada);
        entrada = (entrada + 1) % TAMANHO_BUFFER;

        mutex.V();
        full.V();
    }

// metodo executado pelo consumidor
    public Object consome(String nome) throws InterruptedException
    {
        full.P("Full",nome);
        mutex.P("Mutex",nome);

        qtde--;
        Object item = buffer[saida];
        System.out.println(nome + " - " + "Consome posicao: " + saida);
        saida = (saida + 1) % TAMANHO_BUFFER;

        mutex.V();
        empty.V();

        return item;
    }

    private static final int TAMANHO_BUFFER = 10;
    private int qtde;
    private int entrada;
    private int saida;
    private Object[] buffer;

    private Semaforo mutex;
    private Semaforo empty;
    private Semaforo full;

}
