public class Exercicio17
{
  public static void main(String[] args)
  {
    double n1;
    n1 = Entrada.leiaDouble("Valor do raio:");   
    
    double C = Math.PI * 2 * n1;
    double A = Math.PI * Math.pow(n1,2);
    double V = 0.75 * Math.PI * Math.pow(n1,3);    
    
    System.out.println("O valor do comprimento �:"+C);
    System.out.println("O valor da �rea �:"+A);
    System.out.println("O valor do volume �:"+V);
    
  }
}
