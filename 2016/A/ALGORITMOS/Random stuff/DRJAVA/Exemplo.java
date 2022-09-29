public class Exemplo
{
  public static void main(String[] args)
  {
    double n1, n2;
    n1 = Entrada.leiaDouble("Digite o primeiro número:");
    n2 = Entrada.leiaDouble("Digite o segundo número:");
    
    double resultado = n1 - n2;
    
    System.out.println("O resultado é: "+resultado);
  }
}
