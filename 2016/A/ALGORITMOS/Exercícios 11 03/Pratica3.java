// Augusto Fritz
public class Pratica3
{
  public static void main(String[] args)
  {
    int x, Num;
    double Soma;
    
    x = 1;
    Soma = 0;
    while (x <= 5)
    {
      Num = Entrada.leiaInt("Digite o "+x+"� n�mero:");
      Soma = Soma + Num;
      
      x = x + 1;
    }  
    
    System.out.println("A m�dia �: "+Soma / 5);
  }
}