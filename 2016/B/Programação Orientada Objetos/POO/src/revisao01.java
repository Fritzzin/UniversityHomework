
/**
 *
 * @author augusto.fritz
 */
public class revisao01
{

    public static void main(String[] args)
    {
        double cordX = Entrada.leiaInt("Coordenada X:");
        double cordY = Entrada.leiaInt("Coordenada Y:");

        if (cordX > 0 && cordY > 0)
        {
            System.out.println("A coordenada " + cordX + "," + cordY + " está localizada no 1º quadrante.");
        }

        if (cordX < 0 && cordY > 0)
        {
            System.out.println("A coordenada " + cordX + "," + cordY + " está localizada no 2º quadrante.");
        }

        if (cordX < 0 && cordY < 0)
        {
            System.out.println("A coordenada " + cordX + "," + cordY + " está localizada no 3º quadrante.");
        }

        if (cordX > 0 && cordY < 0)
        {
            System.out.println("A coordenada " + cordX + "," + cordY + " está localizada no 4º quadrante.");
        }

        if ((cordX > 0 || cordX < 0) && cordY == 0)
        {
            System.out.println("A coordenada " + cordX + "," + cordY + " está localizada eixo das abscissas.");
        }

        if (cordX == 0 && (cordY > 0 || cordY < 0))
        {
            System.out.println("A coordenada " + cordX + "," + cordY + " está localizada eixo das ordenadas.");
        }

        if (cordX == 0 && cordY == 0)
        {
            System.out.println("A coordenada " + cordX + "," + cordY + " está localizada na origem.");
        }
    }
}
