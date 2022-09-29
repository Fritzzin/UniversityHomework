public class Exercicio20
{
  public static void main(String[] args)
  {
    double n1, n2;
    n1 = Entrada.leiaDouble("Ângulo da escada:");   
    n2 = Entrada.leiaDouble("Distância da escada:");
    
    double angRad = (Math.PI * n1) / 180;
    double cos = Math.cos(angRad);
    double escada = n2 / cos;
    
    System.out.println("A medida da escada é:"+escada);   
    
  }
}
