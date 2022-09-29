
public class Semaforo
{

    private int valor;

    public Semaforo(int valor)
    {
        this.valor = valor;
    }

    public synchronized void P(String tipo,String nome) throws InterruptedException
    {
        valor = valor - 1;
        if (valor < 0)
        {
            System.out.println(nome + " - " + tipo + " Dorme");
            wait();
            System.out.println(nome + " - " + tipo + " Acordando");

        }

    }

    public synchronized void V()
    {
        valor = valor + 1;
        if (valor <= 0)
        {
            // acorda
            notify();
            
        }

    }

}
