public class Exercicio6
{
  public static void main(String[] args)
  {
    double n1, n2;
    char n3;
    
    n1 = Entrada.leiaDouble("Digite o 1º número:");
    n2 = Entrada.leiaDouble("Digite o 2º número:");
    n3 = Entrada.leiaChar("Digite uma opção\n"+
                            "a) O primeiro número elevado ao segundo número\n"+
                            "b) Raiz quadrada de cada um dos números.\n"+
                            "c) Raiz cúbica de cada um dos números. \n");
    
    if (n3 == 'a')
    {
      o1 = Math.pow(n1,n2);
      
      System.out.println("O valor da potência é: "+o1);
    }
    else
    {
      if (n3 == 'b')
    