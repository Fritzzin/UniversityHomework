public class Exercicio22
{
  public static void main(String[] args)
  {
    int n1;
    n1 = Entrada.leiaInt("Quantos lados tem o pol�gono:");
   
    int r1 = (n1 * (n1-3)) /2;
    
    System.out.println("O n�mero de diagonais �: "+r1);
  }
}
