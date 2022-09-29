public class revisao02
{
  public static void main (String[] args)
  {
    double base = Entrada.leiaDouble("Digite a base do retângulo:");
    double altura = Entrada.leiaDouble ("Digite a altura do retângulo:");
    
    System.out.println("Área = "+(base * altura));
    System.out.println("Perímetro = "+((base*2)+(altura*2)));
  }
}