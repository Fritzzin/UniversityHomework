public class Exercicio10
{
  public static void main(String[] args)
  {
    double n1, o1, o2, o3;
    
    n1 = Entrada.leiaDouble("Digite o custo de fábrica:");
    
    if (n1 <= 12000)
    {
      o1 = n1 * 1.05;
      
      System.out.println("O valor do carro é: "+o1);
    }
    else
    {
      if (n1 > 12000 && n1 <= 25000)
      {
        o2 = (n1 * 1.10) * 1.15;
        
        System.out.println("O valor do carro é: "+o2);
      }
      else
      {
        if (n1 > 25000)
        {
          o3 = (n1 * 1.15) * 1.20;
          
          System.out.println("O valor do carro é: "+o3);
        }
      }
    }
  }
}
