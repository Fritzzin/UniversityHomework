public class Exercicio8
{
  public static void main(String[] args)
  {
    double n1, o1, o2;
    
    n1 = Entrada.leiaDouble("Digite o salário:");
    
    if (n1 <= 300)
    {
      o1 = n1 * 1.35;
      
      System.out.println("O novo salário é: "+o1);
    }
    else
    {
      o2 = n1 * 1.15;
      
      System.out.println("O novo salário é "+o2);
    }
  }
}