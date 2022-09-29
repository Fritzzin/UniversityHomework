public class Exercicio14
{
  public static void main(String[] args)
  {
    double n1, o1, o2, o3, o4, o5, o6;
    
    n1 = Entrada.leiaDouble("Digite o valor do salário:");
    
    if (n1 <= 300)
    {
      o1 = n1 * 1.50;
      
      System.out.println("Novo salário: "+o1);
    }
    else
    {
      if (n1 > 300 && n1 <= 500)
      {
        o2 = n1 * 1.40;
        
        System.out.println("Novo salário: "+o2);
      }
      else
      {
        if (n1 > 500 && n1 <= 700)
        {
          o3 = n1 * 1.30;
          
          System.out.println("Novo salário: "+o3);
        }
        else
        {
          if (n1 > 700 && n1 <= 800)
          {
            o4 = n1 * 1.20;
            
            System.out.println("Novo salário: "+o4);
          }
          else
          {
            if (n1 > 800 && n1 <= 1000)
            {
              o5 = n1 * 1.10;
              
              System.out.println("Novo salário: "+o5);
            }
            else
            {
              if (n1 > 1000)
              {
                o6 = n1 * 1.05;
                
                System.out.println("Novo salário: "+o6);
              }
            }
          }
        }
      }
    }
  }
}
