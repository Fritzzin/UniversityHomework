public class Exercicio18
{
  public static void main(String[] args)
  {
    double n1;
    n1 = Entrada.leiaDouble("Temperatura em Celcius:");   
    
    double F = (180 * (n1+32)) / 100;      
    
    System.out.println("A temperatura em Fahrenheit é:"+F);    
    
  }
}
