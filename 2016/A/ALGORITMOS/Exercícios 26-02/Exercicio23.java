public class Exercicio23
{
  public static void main(String[] args)
  {
    int n1, n2;
    n1 = Entrada.leiaInt("Medida do 1ºangulo:");
    n2 = Entrada.leiaInt("Medida do 2ºangulo:");
   
    int r1 = n1 + n2;
    int r2 = 180 - r1;
    
    System.out.println("A medida do 3º angulo é: "+r2);
  }
}
