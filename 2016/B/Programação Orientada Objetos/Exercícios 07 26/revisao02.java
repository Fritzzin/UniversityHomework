public class revisao02
{
  public static void main (String[] args)
  {
    double base = Entrada.leiaDouble("Digite a base do ret�ngulo:");
    double altura = Entrada.leiaDouble ("Digite a altura do ret�ngulo:");
    
    System.out.println("�rea = "+(base * altura));
    System.out.println("Per�metro = "+((base*2)+(altura*2)));
  }
}