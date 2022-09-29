public class Exercicio4
{
  public static void main(String[] args)
  {
    double n1, n2;
    n1 = Entrada.leiaDouble("Digite a primeira nota:");
    n2 = Entrada.leiaDouble("Digite a segunda nota:");
    
    double n3 = n1 * 2;
    double n4 = n2 * 3;
    
    double n5 = n3 + n4;
    double n6 = n5 / 5;
    System.out.println("O resultado é: "+n6);
  }
}
