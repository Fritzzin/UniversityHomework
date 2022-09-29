public class Exercicio12
{
  public static void main(String[] args)
  {
    double n1, o1, o2, o3, o4;
    
    n1= Entrada.leiaDouble("Salário bruto:");
    
    if (n1 <= 350)
    {
      o1 = (n1 + 100) * 0.93;
      
      System.out.println("Valor a receber: "+o1);
    }
    else
    {
      if (n1 > 350 && n1 <= 600)
      {
        o2 = (n1 + 75) * 0.93;
        
        System.out.println("Valor a receber: "+o2);
      }
      else
      {
        if (n1 > 600 && n1 <= 900)
        {
          o3 = (n1 + 50) * 0.93;
          
          System.out.println("Valor a receber: "+o3);
        }
        else
        {
          if (n1 > 900)
          {
            o4 = (n1 + 35) * 0.93;
            
            System.out.println("Valor a receber: "+o4);
          }
        }
      }
    }
  }
}
