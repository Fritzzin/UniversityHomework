// Author: Auguto Fritz
public class ExercicioData
{
     public static void main(String[] args)
     {
          int ano, mes, dia;
          
          dia = Entrada.leiaInt("Digite o dia:");
          mes = Entrada.leiaInt("Digite o mês:");
          ano = Entrada.leiaInt("Digite o ano:");
          
          if (mes == 1 && dia >= 1 && dia <= 31)
          {
               System.out.println("A data está correta!");
          }
          else
          {
               if (mes == 2 && dia >= 1 && dia <= 28)
               {
                    System.out.println("A data está correta!");         
               }
               else
               {
                    if (mes == 3 && dia >= 1 && dia <= 31)
                    {
                         System.out.println("A data está correta!");
                    }         
                    
                    else
                    {
                         if (mes == 4 && dia >= 1 && dia <= 30)
                         {
                              System.out.println("A data está correta!");
                         }
                         else
                         {
                              if (mes == 5 && dia >= 1 && dia <= 31)
                              {
                                   System.out.println("A data está correta!");
                              }
                              else
                              {
                                   if (mes == 6 && dia >= 1 && dia <= 30)
                                   {
                                        System.out.println("A data está correta!");
                                   }
                                   else
                                   {
                                        if (mes == 7 && dia >= 1 && dia <= 31)
                                        {
                                             System.out.println("A data está correta!");
                                        }
                                        else
                                        {
                                             if (mes == 8 && dia >= 1 && dia <= 31)
                                             {
                                                  System.out.println("A data está correta!");
                                             }
                                             else
                                             {
                                                  if (mes == 9 && dia >= 1 && dia <= 30)
                                                  {
                                                       System.out.println("A data está correta!");
                                                  }
                                                  else
                                                  {
                                                       if (mes == 10 && dia >= 1 && dia <= 31)
                                                       {
                                                            System.out.println("A data está correta!");
                                                       }
                                                       else
                                                       {
                                                            if (mes == 11 && dia >= 1 && dia <= 30)
                                                            {
                                                                 System.out.println("A data está correta!");
                                                            }
                                                            else
                                                            {
                                                                 if (mes == 12 && dia >= 1 && dia <= 31)
                                                                 {
                                                                      System.out.println("A data está correta!");
                                                                 }
                                                                 else
                                                                 {
                                                                      System.out.println("A data é inválida!");
                                                                 }
                                                            }
                                                       }
                                                  }
                                             }
                                        }
                                   }
                              }
                         }
                    }
               }
          }
     }
}

