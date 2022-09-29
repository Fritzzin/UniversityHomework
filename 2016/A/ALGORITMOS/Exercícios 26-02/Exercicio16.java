public class Exercicio16
{
  public static void main(String[] args)
  {
    double n1, n2;
    n1 = Entrada.leiaDouble("Primeiro cateto");   
    n2 = Entrada.leiaDouble("Segundo cateto");
    
    double r1 = n1 * n1;
    double r2 = n2 * n2;
    double r3 = r1 + r2;
    double r4 = Math.sqrt(r3);
    
    System.out.println("O valor da hipotenusa é:"+r4);
            
  }
}
