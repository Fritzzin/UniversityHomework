public class Exemplo
{
  public static void main(String[] args)
  {
    double n1, n2;
    n1 = Entrada.leiaDouble("Digite o primeiro n�mero:");
    n2 = Entrada.leiaDouble("Digite o segundo n�mero:");
    
    double resultado = n1 - n2;
    
    System.out.println("O resultado �: "+resultado);
  }
}
