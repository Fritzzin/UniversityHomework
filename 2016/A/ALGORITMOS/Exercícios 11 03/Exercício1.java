// Augusto Fritz
public class Exercício1
{
  public static void main(String[] args)
  {
    int Num, x, Soma;
    
    x = 0;
    Soma = 0;
    while (x < 10)
    {
      Num = Entrada.leiaInt("Digite o número:");
      Soma = Soma + Num;
      
      x = x + 1;
    }  
    
    System.out.println("A soma de todos os números é: "+Soma);
  }
}