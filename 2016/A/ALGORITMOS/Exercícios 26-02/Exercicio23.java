public class Exercicio23
{
  public static void main(String[] args)
  {
    int n1, n2;
    n1 = Entrada.leiaInt("Medida do 1�angulo:");
    n2 = Entrada.leiaInt("Medida do 2�angulo:");
   
    int r1 = n1 + n2;
    int r2 = 180 - r1;
    
    System.out.println("A medida do 3� angulo �: "+r2);
  }
}
