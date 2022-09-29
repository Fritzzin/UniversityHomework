public class Exercicio3
{
  public static void main(String[] args)
  {
    double n1, n2;
    n1 = Entrada.leiaDouble("Digite o primeiro número:");
    n2 = Entrada.leiaDouble("Digite o segundo número (não podendo o mesmo ser 0):");
    
    double n3 = n1 / n2;
    
    System.out.println("O resultado é: "+n3);
  }
}
