public class Exercicio4
{
  public static void main(String[] args)
  {
    double n1, n2, n3;
    
    n1 = Entrada.leiaDouble("Digite o 1� n�mero:");
    n2 = Entrada.leiaDouble("Digite o 2� n�mero:");
    n3 = Entrada.leiaDouble("Digite o 3� n�mero:");
    
    if (n1 > n2 && n1>n3)
    {
      System.out.println("O maior n�mero �:"+n1);
    }
    else
    {
      if (n2 > n1 && n2 >n3)
      {
        System.out.println("O maior n�mero �:"+n2);
      }
      else
      {
        if (n3 > n1 && n3 > n2)
        {
          System.out.println("O maior n�mero �:"+n3);
        }
      }
    }
  }
}
