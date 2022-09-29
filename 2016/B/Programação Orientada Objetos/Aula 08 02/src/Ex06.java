
/**
 *
 * @author augusto.fritz
 */
public class Ex06
{
    public static void main(String[] args)
    {
        Ponto var = new Ponto();
        for (int i = 0; i < 10; i++)
        {
            var.x[i] = Entrada.leiaDouble("X do "+(i+1)+"º ponto:");
            var.y[i] = Entrada.leiaDouble("Y do "+(i+1)+"º ponto:");
        }
        double[] resultado = var.obterDistancia();
        
        for (int c = 0; c < 9; c++)
        {
            System.out.println("A distância entre o " + (c + 1) + "º e o " + (c + 2) + "º ponto é : " +resultado[c] );
        }
    }
}
