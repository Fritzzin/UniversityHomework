/*
 * @Author: Augusto Fritz
 */

public class tde3
{
     public static void main(String[] args)
     {
          int x = Entrada.leiaInt("Digite o ponto X:");
          int y = Entrada.leiaInt("Digite o ponto Y:");
          
          if (x == 0 && y == 0)
          {
               System.out.println("O ponto se encontra na origem.");
          }
          else
          {
               if ((x > 0 || x < 0) && y == 0) // eixo X
               {
                    System.out.println("O ponto se encontra no eixo X");
               }
               else
               {
                    if ((y > 0 || y < 0) && x == 0)
                    {
                         System.out.println("O ponto se encontra no eixo Y");
                    }
                    else
                    {
                         if (x > 0 && y > 0) //1ºQuadrante
                         {
                              System.out.println("O ponto se encontra no 1ºQuadrante.");
                         }
                         else
                         {
                              if(x < 0 && y > 0) //2ºQuadrante
                              {
                                   System.out.println("O ponto se encontra no 2ºQuadrante.");
                              }
                              else
                              {
                                   if(x < 0 && y < 0) //3ºQuadrante
                                   {
                                        System.out.println("O ponto se encontra no 3ºQuadrante.");
                                   }
                                   else
                                   {
                                        if(x > 0 && y < 0) //4ºQuadrante
                                        {
                                             System.out.println("O ponto se encontra no 4ºQuadrante.");
                                        }
                                   }
                              }
                         }
                    }
               }
          }
     }
}

                                        