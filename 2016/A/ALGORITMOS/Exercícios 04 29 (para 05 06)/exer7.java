/*
 * @Author: Augusto Fritz
 */

public class exer7
{
     public static void main(String[] args)
     {
          int[] x = new int[10];
          int negativos = 0;
          int soma = 0;
          
          for (int c=0 ; c<10 ; c++)
          {
               x[c] = Entrada.leiaInt("Digite o "+(c+1)+"º número");
               
               if (x[c] < 0)
               {
                   negativos = negativos + 1;
               }
               else
               {
                   soma = soma + x[c];
               }
          }
          System.out.println("Quantidade de negativos : "+negativos);
          System.out.println("Soma dos positivos : "+soma);
     }
}
