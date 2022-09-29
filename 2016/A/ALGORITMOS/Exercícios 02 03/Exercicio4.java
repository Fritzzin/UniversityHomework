public class Exercicio4
{
  public static void main(String[] args)
  {
    double n1, n2, n3;
    
    n1 = Entrada.leiaDouble("Digite o 1º número:");
    n2 = Entrada.leiaDouble("Digite o 2º número:");
    n3 = Entrada.leiaDouble("Digite o 3º número:");
    
    if (n1 > n2 && n1>n3)
    {
      System.out.println("O maior número é:"+n1);
    }
    else
    {
      if (n2 > n1 && n2 >n3)
      {
        System.out.println("O maior número é:"+n2);
      }
      else
      {
        if (n3 > n1 && n3 > n2)
        {
          System.out.println("O maior número é:"+n3);
        }
      }
    }
  }
}
