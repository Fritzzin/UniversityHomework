// Augusto Fritz
public class Exerc�cio1
{
  public static void main(String[] args)
  {
    int Num, x, Soma;
    
    x = 0;
    Soma = 0;
    while (x < 10)
    {
      Num = Entrada.leiaInt("Digite o n�mero:");
      Soma = Soma + Num;
      
      x = x + 1;
    }  
    
    System.out.println("A soma de todos os n�meros �: "+Soma);
  }
}