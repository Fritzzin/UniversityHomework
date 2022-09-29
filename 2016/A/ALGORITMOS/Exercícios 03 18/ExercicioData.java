// Author: Auguto Fritz
public class ExercicioData
{
     public static void main(String[] args)
     {
          int ano, mes, dia, anoB, mesB, diaB;
          
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
                                                                      if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) //bissexto
                                                                      {
                                                                           anoB = 1;
                                                                      }
                                                                      else
                                                                      {
                                                                           anoB = 0;
                                                                      }
                                                                      
                                                                      if (anoB == 1 && mes == 2)
                                                                      {
                                                                           mesB=1;
                                                                      }
                                                                      else
                                                                      {
                                                                           mesB=0;
                                                                      }
                                                                      
                                                                      if (mesB == 1 && dia == 29)
                                                                      {
                                                                           diaB = 1;
                                                                      }
                                                                      else
                                                                      {
                                                                           diaB = 0;
                                                                      }
                                                                      
                                                                      if (anoB ==1 && mesB == 1 && diaB == 1)
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
}

