/*
 * @Author: Augusto Fritz
 */

public class exercicio1
{
     public static void main(String[] args)
     {
          double[] n = new double[10];
          double soma = 0;
          for (int c=0; c<10; c++)
          {
               n[c] = Entrada.leiaDouble("Digite um número:");
               
               soma = soma + n[c];
          }
          double media = soma / 10;
          System.out.println("A média é : "+media);
          
          for (int c=0; c<10; c++)
          {
               if (n[c] < media)
               {
                    System.out.println(n[c]+" está abaixo da média.");
               }
               else
               {
               }
          }
     }
}
