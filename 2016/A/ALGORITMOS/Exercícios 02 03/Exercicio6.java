public class Exercicio6
{
  public static void main(String[] args)
  {
    double n1, n2;
    char n3;
    
    n1 = Entrada.leiaDouble("Digite o 1� n�mero:");
    n2 = Entrada.leiaDouble("Digite o 2� n�mero:");
    n3 = Entrada.leiaChar("Digite uma op��o\n"+
                            "a) O primeiro n�mero elevado ao segundo n�mero\n"+
                            "b) Raiz quadrada de cada um dos n�meros.\n"+
                            "c) Raiz c�bica de cada um dos n�meros. \n");
    
    if (n3 == 'a')
    {
      o1 = Math.pow(n1,n2);
      
      System.out.println("O valor da pot�ncia �: "+o1);
    }
    else
    {
      if (n3 == 'b')
    