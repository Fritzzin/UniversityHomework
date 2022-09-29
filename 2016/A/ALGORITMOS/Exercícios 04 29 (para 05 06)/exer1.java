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
               x[c] = Entrada.leiaInt("Digite um número:");
               
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
          System.out.println("Há "+quantP+" de números pares, são eles :..... "+par);
          System.out.println("Há "+quantI+" de números ímpares, são eles :... "+impar); 
     }
}
