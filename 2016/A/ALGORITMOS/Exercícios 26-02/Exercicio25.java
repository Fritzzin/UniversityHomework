public class Exercicio25
{
  public static void main(String[] args)
  {
    int n1, n2;
    n1 = Entrada.leiaInt("Quantidade de horas:");
    n2 = Entrada.leiaInt("Quantidade de minutos:");
   
    int r1 = n1 * 60;
    int r2 = n2 + r1;
    int r3 = r2 * 60;
    
    System.out.println("Hora digitada em minutos: "+r1);
    System.out.println("Total de minutos:"+r2);
    System.out.println("Total de segundos:"+r3);
  }
}
