// Augusto Fritz
public class Pratica4
{
  public static void main(String[] args)
  {
    int  Num, x;
    double Soma;
    
    x = 0;
    Soma = 0;
    Num = 1;
    while (Num != 0)
    {
      Num = Entrada.leiaInt("Digite o "+(x+1)+"� n�mero:");
      Soma = Soma + Num;
      
      x = x + 1;
    }  
    System.out.println("A m�dia �: "+Soma / (x-1));
  }
}