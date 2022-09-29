
import static java.lang.Thread.sleep;

//Programa principal
public class ProdutorConsumidor
{

    public static void main(String args[]) throws InterruptedException
    {
        Buffer buffer = new Buffer();

        Produtor produtor = new Produtor(buffer, "P");
        Consumidor consumidor = new Consumidor(buffer, "C");
        //Consumidor consumidor1 = new Consumidor(buffer, "Cb");

        produtor.start();
        consumidor.start();
        //consumidor1.start();
    }
}
