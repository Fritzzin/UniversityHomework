
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// ESTRUTURA THREAD CONSUMIDORA
public class Consumidor extends Thread
{

    public Consumidor(Buffer b, String nome)
    {
        buffer = b;
        this.nome = nome;
    }

    public void run()
    {
        for (int i = 0; i < 20; i++)
        {
            Date item;
            try
            {
                sleep(500);
                item = (Date) buffer.consome(nome);
            } catch (InterruptedException ex)
            {
            }
        }
    }

    public String getNome()
    {
        return this.nome;
    }

    private Buffer buffer;
    private String nome;

}
