public class Exercicio3
{
  public static void main(String[] args)
  {
    double n1, n2;
    
    n1 = Entrada.leiaDouble ("Digite o 1º número:");
    n2 = Entrada.leiaDouble ("Digite o 2º número:");
    
    if (n1 > n2)
    {
      System.out.println("O maior número é:"+n1);
    }
    else
    {
      System.out.println("O maior número é:"+n2);
    }
  }
}
