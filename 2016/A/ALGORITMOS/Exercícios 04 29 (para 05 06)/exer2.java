/*
 * @Author: Augusto Fritz
 */

public class exer2
{
     public static void main(String[] args)
     {
          int[] x = new int[7];
          String mult2 = "";
          String mult3 = "";
          String mult23 = "";
          
          for (int c =0;c<7;c++)
          {
               x[c] = Entrada.leiaInt("Digite um n�mero");
               
               if (x[c] % 2 == 0)
               {
                    mult2 = mult2 + x[c] + " ";
               }
               if (x[c] % 3 == 0)
               {
                    mult3 = mult3 + x[c] + " ";
               }
               if (x[c] % 2 == 0 && x[c] % 3 == 0)
               {
                    mult23 = mult23 + x[c] + " ";
               }
          }
          System.out.println("Os m�ltiplos de 2 s�o :............ "+mult2);
          System.out.println("Os m�ltiplos de 3 s�o :............ "+mult3);
          System.out.println("Os m�ltiplos de 2 e 3 s�o :........ "+mult23);
     }
}
