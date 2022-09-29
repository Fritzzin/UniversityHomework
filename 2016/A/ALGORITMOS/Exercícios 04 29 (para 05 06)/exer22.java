/*
 * @Author: Augusto Fritz
 */

public class exer22
{
     public static void main(String[] args)
     {
         int[] r1 = new int[10];
         int[] r2 = new int[10];
         
         for(int c=0;c<10;c++)
         {
             r1[c] = Entrada.leiaInt("Digite o "+(c+1)+"º valor");
             if (r1[c] > 0)
             {
                 r2[c] = r1[c];
             }
         }
         
         for(int c=0;c<10;c++)
         {
             System.out.println((c+1)+"º valor : "+r2[c]);
         }
     }
}