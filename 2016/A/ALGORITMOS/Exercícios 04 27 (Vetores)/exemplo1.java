/*
 * @Author: Augusto Fritz
 */

public class exemplo1
{
     public static void main(String[] args)
     {
          int[] x = new int[10];
          
          for (int i=0 ; i < 10 ; i++)
          {
               x[i] = Entrada.leiaInt();
          }
          
          for (int i=0 ; i < 10 ; i++)
          {
               System.out.println(x[i]);
          }
     }          
}