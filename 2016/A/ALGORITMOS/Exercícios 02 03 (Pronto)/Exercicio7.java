public class Exercicio7
{
  public static void main(String[] args)
  {
    double n1, o1;
    
    n1 = Entrada.leiaDouble("Valor do salário:");
    
    if (n1 <= 500)
    {
      o1 = n1 * 1.3;
      
      System.out.println("O salário reajustado é: "+o1);
    }
    else
    {
      System.out.println("O salário digitado não tem direito ao reajuste.");
    }
  }
}
