/*
 * @Author: Augusto Fritz
 */

public class exer1
{
     public static void main(String[] args)
     {
          int[] x = new int[6];
          String par = "";
          int quantP = 0;
          String impar = "";
          int quantI = 0;
          
          for (int c=0; c<6 ; c++)
          {
               x[c] = Entrada.leiaInt("Digite um n�mero:");
               
               if (x[c] % 2 == 0)
               {
                    par = par + x[c] + " ";
                    quantP = quantP + 1;
               }
               else
               {
                    impar = impar + x[c] + " ";
                    quantI = quantI + 1;
               }
          }
          System.out.println("H� "+quantP+" de n�meros pares, s�o eles :..... "+par);
          System.out.println("H� "+quantI+" de n�meros �mpares, s�o eles :... "+impar); 
     }
}
