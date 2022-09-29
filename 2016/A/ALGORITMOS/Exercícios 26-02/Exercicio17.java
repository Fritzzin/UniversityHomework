public class Exercicio17
{
  public static void main(String[] args)
  {
    double n1;
    n1 = Entrada.leiaDouble("Valor do raio:");   
    
    double C = Math.PI * 2 * n1;
    double A = Math.PI * Math.pow(n1,2);
    double V = 0.75 * Math.PI * Math.pow(n1,3);    
    
    System.out.println("O valor do comprimento é:"+C);
    System.out.println("O valor da área é:"+A);
    System.out.println("O valor do volume é:"+V);
    
  }
}
