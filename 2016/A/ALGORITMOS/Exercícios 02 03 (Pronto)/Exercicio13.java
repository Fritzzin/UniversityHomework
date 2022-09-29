public class Exercicio13
{
  public static void main(String[] args)
  {
    double n1, np;
    
    n1 = Entrada.leiaDouble("Valor do produto");
    np = 0;
    
    if (n1 <= 50)
    {
      np = n1 * 1.05;
    }
    else
    {
      if (n1 > 50 && n1 <= 100)
      {
        np = n1 * 1.10;
      }
      else
      {
        if (n1 > 100)
        {
          np = n1 * 1.15;
        }
      }
    }
    if (np <= 80)
    {
      System.out.println("Novo preço: "+np +" Classificação: Barato");
    }
    else
    {
      if (np > 80 && np <= 120)
      {
        System.out.println("Novo preço: "+np +" Classificação: Normal");
      }
      else
      {
        if (np > 120 && np <= 200)
        {
          System.out.println("Novo preço: "+np +" Classificação: Caro");
        }
        else
        {
          if (np > 200)
          {
            System.out.println("Novo preço: "+np +" Classificação: Muito Caro");
          }
        }
      }
    }
  }
}

