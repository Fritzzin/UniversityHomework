/*
 * @Author: Augusto Fritz
 */

public class exer3crescente
{
     public static void main(String[] args)
     {
          int[] n= new int[10];
          int x = 0;
          for(int c=0;c<10;c++)
          {
               n[c]=Entrada.leiaInt("Digite o "+(c+1)+"º número:");
          }
          
          for(int c=0;c<10;c++)
          {
               for(int i=0;i<9-c;i++)
               {                         
                    if(n[i] > n[i+1])
                    {
                         x = n[i+1];
                         n[i+1] = n[i];
                         n[i] = x ;
                         
                    }
               }
          }
          
          for(int c=0;c<10;c++)
          {
               System.out.println(n[c]);
          }
     }
}
