public class Exercicio6
{
  public static void main(String[] args)
  {
    double n1, n2;
    n1 = Entrada.leiaDouble("Digite o sal�rio fixo:");
    n2 = Entrada.leiaDouble("Digite o valor das vendas:"); 
    
    double n3 = n2 * 0.04;
    double n4 = n3 + n1;
    
    System.out.println("O valor da comiss�o �:"+n3);
    System.out.println("O sal�rio final �:"+n4);
  }
}
