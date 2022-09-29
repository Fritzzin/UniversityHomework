/*
 * @Author: Augusto Fritz
 */

public class desafioFibonacciVetores
{
     public static void main(String[] args)
     {
          int[] n = new int[10];
          n[0] = 0;
          n[1] = 1;
          for(int c=2; c<10;c++)
          {
               n[c] = n[c-1] + n[c-2];
          }
          
          for(int c=9;c>=0;c--)
          {
               System.out.println(n[c]);
          }
     }
}

               
          