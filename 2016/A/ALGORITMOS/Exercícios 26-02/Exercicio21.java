public class Exercicio21
{
  public static void main(String[] args)
  {
    double n1, n2, n3;
    n1 = Entrada.leiaDouble("Número de horas trabalhadas:");
    n2 = Entrada.leiaDouble("Valor do salário mínimo:");
    n3 = Entrada.leiaDouble("Número de horas extras trabalhadas:");
    
    double r1 = (n2 / 8) * n1;
    double r2 = (n2 / 4) * n3;
    double r3 = n1 * r1;
    double r4 = n3 * r2;
    double r5 = r3 + r4;
    
    System.out.println("A salário total é: "+r5);
  }
}
