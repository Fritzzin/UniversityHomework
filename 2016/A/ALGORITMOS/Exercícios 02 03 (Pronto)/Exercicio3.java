public class Exercicio3
{
  public static void main(String[] args)
  {
    double n1, n2;
    
    n1 = Entrada.leiaDouble ("Digite o 1� n�mero:");
    n2 = Entrada.leiaDouble ("Digite o 2� n�mero:");
    
    if (n1 > n2)
    {
      System.out.println("O maior n�mero �:"+n1);
    }
    else
    {
      System.out.println("O maior n�mero �:"+n2);
    }
  }
}
