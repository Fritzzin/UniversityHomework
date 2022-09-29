/*
 * @Author: Augusto Fritz
 */

public class exer20
{
     public static void main(String[] args)
     {
         int[] x = new int[10];
         String positivos = "";
         
         for(int c=0;c<10;c++)
         {
             x[c] = Entrada.leiaInt("Digite o "+(c+1)+"º número");
             
             if (x[c] > 0)
             {
                 positivos = positivos + x[c] + " ";
             }
         }
         System.out.println("Positivos : "+positivos);
     }
}
