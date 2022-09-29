public class ExemploDesvioCondicional
{
  public static void main(String[] args)
  {
    double compr = Entrada.leiaDouble("Digite o comprimento da sala da sua casa:");
    double larg = Entrada.leiaDouble("Digite a largura da sala da sua casa:");
    
    double area = compr * larg;
    
    if (area < 12)
    {
     System.out.println("A sala da sua casa é pequena"); 
    }
    else
    {
      if (area < 50)
      {
        System.out.println("A sala da sua casa é grande");
      }
      else
      {
    System.out.println("A sala da sua casa é grande");
    }
          
  }
}
}

