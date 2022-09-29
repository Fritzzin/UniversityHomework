/*
 * @Author: Augusto Fritz
 */

public class exer4
{
     public static void main(String[] args)
     {
          int[] x = new int[15];
          
          for (int c = 0; c<15 ; c++)
          {
               x[c] = Entrada.leiaInt("Digite o "+(c+1)+"º número");
               
               if (x[c] == 30)
               {
                    System.out.println("Há um elemento igual a 30 na posição : "+(c+1));
               }
          }
     }
}
