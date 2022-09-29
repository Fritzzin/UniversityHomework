public class Exercicio9
{
  public static void main(String[] args)
  {
    double n1, n2, n3;
    n1 = Entrada.leiaDouble("Valor da base maior:");
    n2 = Entrada.leiaDouble("Valor da base menor:");
    n3 = Entrada.leiaDouble("Valor da altura:");
    
    double n4 = n1 + n2;
    double n5 = n4 * n3;
    double n6 = n5 / 2;
    
    System.out.println("A área do trapézio é:"+n6);
  }
}
