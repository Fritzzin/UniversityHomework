public class Exercicio18
{
  public static void main(String[] args)
  {
    double n1;
    
    n1 = Entrada.leiaDouble ("Digite sua idade:");
    
    if (n1 < 18)
    {
      System.out.println ("Voc� � de menor!");
    }
    else
    {
      System.out.println ("Voc� � de maior!");
    }
  }
}