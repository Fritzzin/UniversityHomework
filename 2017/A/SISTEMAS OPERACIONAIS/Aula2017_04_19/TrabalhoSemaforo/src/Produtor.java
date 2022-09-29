
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// ESTRUTURA THREAD PRODUTORA
public class Produtor extends Thread
{

    public Produtor(Buffer b, String nome)
    {
        buffer = b;
        this.nome = nome;
    }

    public void run()
    {
        for (int i = 0; i < 20; i++)
        {
            Date item = new Date();
            try
            {
                //sleep(100);
                buffer.produz(item, nome);
            } catch (InterruptedException ex)
            {
            }
        }
    }

    private Buffer buffer;
    private String nome;
}
