public class Exercicio8
{
  public static void main(String[] args)
  {
    double n1;
    n1 = Entrada.leiaDouble("Digite seu peso:");
    
    double n2 = n1 * 0.15;
    double n3 = n2 + n1;
    double n4 = n1 * 0.80;
    
    System.out.println("Se engordar 15%:"+n3);
    System.out.println("Se emagrecer 20%:"+n4);
  }
}
