/*
 * Math.abs(...) <- M�dulo
 * @Author: Augusto Fritz
 */

public class exercicio2
{
     public static void main(String[] args)
     {
          double[] n = new double[10];
          double soma = 0;
          double somaD = 0;
          double desvio = 0;
          for (int c=0; c<10; c++)
          {
               n[c] = Entrada.leiaDouble("Digite um n�mero:");
               
               soma = soma + n[c];
          }
          double media = soma / 10;
          
          for (int c=0; c<10; c++)
          {
               desvio = Math.abs(media - n[c]);
               
               somaD = somaD + desvio;
          }
          System.out.println("M�dia : "+media+" Desvio m�dio : "+(somaD / 10));
     }
}
