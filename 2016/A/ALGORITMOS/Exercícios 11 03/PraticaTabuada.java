// Augusto Fritz
public class PraticaTabuada
{
  public static void main(String[] args)
  {
    int n1, m;
    
    n1 = Entrada.leiaInt("Digite o número:");
    m = 0;
    
    while (m <= 10)
    {
      System.out.println(n1+" x "+m+" = "+n1 * m);
      m = m + 1;
    }
  }
}