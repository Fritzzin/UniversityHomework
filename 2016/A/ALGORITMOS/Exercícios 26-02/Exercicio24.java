public class Exercicio24
{
  public static void main(String[] args)
  {
    double n1;
    n1 = Entrada.leiaDouble("Quantidade de dinheiro em reais:");
   
    double r1 = n1 / 1.80;
    double r2 = n1 / 2;
    double r3 = n1 / 3.57;
    
    System.out.println("O valor em d�lares �: "+r1);
    System.out.println("O valor em marcos alem�es �:"+r2);
    System.out.println("O valor em libras esterlinas �:"+r3);
  }
}
