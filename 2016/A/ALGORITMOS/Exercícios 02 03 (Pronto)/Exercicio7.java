public class Exercicio7
{
  public static void main(String[] args)
  {
    double n1, o1;
    
    n1 = Entrada.leiaDouble("Valor do sal�rio:");
    
    if (n1 <= 500)
    {
      o1 = n1 * 1.3;
      
      System.out.println("O sal�rio reajustado �: "+o1);
    }
    else
    {
      System.out.println("O sal�rio digitado n�o tem direito ao reajuste.");
    }
  }
}
