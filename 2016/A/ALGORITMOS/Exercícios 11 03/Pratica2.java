// Augusto Fritz
public class Pratica2
{
  public static void main(String[] args)
  {
    int Num, x, Soma;
    
    x = 1;
    Soma = 0;
    Num = 1;
    while (Num != 0)
    {
      Num = Entrada.leiaInt("Digite o "+x+"º número:");
      Soma = Soma + Num;
      
      x = x + 1;
    }  
    
    System.out.println("A soma de todos os números é: "+Soma);
  }
}