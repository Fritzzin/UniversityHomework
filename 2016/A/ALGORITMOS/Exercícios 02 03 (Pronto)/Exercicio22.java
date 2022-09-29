public class Exercicio22
{
  public static void main(String[] args)
  {
    double n1, n2;
    
    n1 = Entrada.leiaDouble("Digite a idade");
    n2 = Entrada.leiaDouble("Digite o peso");
    
    if (n1 < 20 && n2 <= 60)
    {
      System.out.println("Grupo de Risco: 9");
    }
    else
    {
      if (n1 < 20 && n2 > 60 && n2 <= 90)
      {
        System.out.println("Grupo de Risco: 8");
      }
      else
      {
        if (n1 < 20 && n2 > 90)
        {
          System.out.println("Grupo de Risco: 7");
        }
      }
    }
    if (n1 >= 20 && n1 <= 50 && n2 <= 60)
    {
      System.out.println("Grupo de Risco: 6");
    }
    else
    {
      if (n1 >= 20 && n1 <= 50 && n2 > 60 && n2 <= 90)
      {
        System.out.println("Grupo de Risco: 5");
      }
      else
      {
        if (n1 >= 20 && n1 <= 50 && n2 > 90)
        {
          System.out.println("Grupo de Risco: 4");
        }
      }
    }
    if (n1 > 50 && n2 <= 60)
    {
      System.out.println("Grupo de Risco: 3");
    }
    else
    {
      if (n1 > 50 && n2 > 60 && n2 <= 90)
      {
        System.out.println("Grupo de Risco: 2");
      }
      else
      {
        if (n1 > 50 && n2 > 90)
        {
          System.out.println("Grupo de Risco: 1");
        }
      }
    }
  }
}
