public class Exercicio23
{
  public static void main(String[] args)
  {
    double n1,n2,q1,q2,o1,o2;
    
    n1 = Entrada.leiaDouble("Código do produto:");
    n2 = Entrada.leiaDouble("Quantidade comprada:");
    q1 = 0;
    
    if (n1 < 1)
    {
      System.out.println("Digite um código válido");
    }
    else
    {
      if (n1 > 40)
      {
        System.out.println("Digite um código válido");
      }
      else
      {
        if (n1 >= 1 && n1 <= 10)
        {
          q1 = 10;
          System.out.println("Preço unitário: "+q1);
        }
        else
        {
          if (n1 >= 11 && n1 <= 20)
          {
            q1 = 15;
            System.out.println("Preço unitário: "+q1);
          }
          else
          {
            if (n1 >= 21 && n1 <= 30)
            {
              q1 = 20;
              System.out.println("Preço unitário: "+q1);
            }
            else
            {
              if (n1 >= 31 && n1 <= 40);
              {
                q1 = 30;
                System.out.println("Preço unitário: "+q1);
              }
            }
          }
        }
      }
    }
    q2 = q1 * n2;
    
    if (q2 <= 250)
    {
      o1 = q2 * 0.05;
      o2 = q2 - o1;
      
      System.out.println("Preço total: "+q2 +"\n"+
                         "Valor do desconto: "+o1 +"\n" +
                         "Preço final: "+o2);
    }
    else
    {
      if (q2 > 250 && q2 <= 500)
      {
        o1 = q2 * 0.10;
        o2 = q2 - o1;
        
        System.out.println("Preço total: "+q2 +"\n"+
                           "Valor do desconto: "+o1 +"\n" +
                           "Preço final: "+o2);
      }
      else
      {
        if (q2 > 500)
        {
          o1 = q2 * 0.15;
          o2 = q2 - o1;
          
          System.out.println("Preço total: "+q2 +"\n"+
                             "Valor do desconto: "+o1 +"\n" +
                             "Preço final: "+o2);
        }
      }
    }
  }
}


