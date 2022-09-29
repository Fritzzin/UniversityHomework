/*
 * @Author: Augusto Fritz
 */

public class exer19
{
     public static void main(String[] args)
     {
         double[] r1 = new double[10];
         double[] r2 = new double[10];
         double[] r3 = new double[10];
         
         for (int c=0;c<10;c++)
         {
             r1[c] = Entrada.leiaDouble("Digite o "+(c+1)+"º número do 1º vetor:");
         }
         for (int c=0;c<10;c++)
         {
             r2[c] = Entrada.leiaDouble("Digite o "+(c+1)+"º número do 2º vetor:");
         }
         for (int c=0;c<10;c++)
         {
              if (r1[c] == r2[c])
             {
                 r3[c] = r1[c] * r2[c];
                 System.out.println(r3[c]);
             }             
         }
     }
}
         
             
                 
            