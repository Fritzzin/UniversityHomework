
/**
 *
 * @author augusto.fritz
 */
public class TelaBebedouro
{

    private Bebedor x;

    public TelaBebedouro(Bebedor x)
    {
        this.x = x;
    }

    public void exibirTela()
    {
        String menu = "Menu do bebedouro \n"
                + "1. Água gelada. \n"
                + "2. Água em temperatura ambiente. \n"
                + "3. Nível do reservatório. \n"
                + "4. Reabastecer o reservatório. \n"
                + "5. Preferência dos usuários. \n"
                + "6. Contadores. \n"
                + "0. Desligar o equipamento";
        
        String comando = Entrada.leiaString(menu);
        
        while (!comando.equals("0"))
        {
            
            if (comando.equals("1"))
            {
                x.setGelada();
            }
            if (comando.equals("2"))
            {
                x.setAmbiente();
            }
            if (comando.equals("3"))
            {
                System.out.println("Nível do reservatório " + x.getReservatorio() + "L");
            }
            if (comando.equals("4"))
            {
                x.reabastecer();
            }
            if (comando.equals("5"))
            {
                System.out.println("Os usuários preferem: " + x.getPreferencia());
            }
            if (comando.equals("6"))
            {
                System.out.println("Total: " + (x.getGelada() + x.getAmbiente()) + " \n"
                        + "Gelada: " + x.getGelada() + " \n"
                        + "Ambiente: " + x.getAmbiente());
            }
            comando = Entrada.leiaString(menu);
        }
    }
}
