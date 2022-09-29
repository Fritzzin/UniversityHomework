public class Exercicio16
{
  public static void main(String[] args)
  {
    double n1, n2, o1, o2;
    
    n1 = Entrada.leiaDouble("Digite o preço atual: ");
    n2 = Entrada.leiaDouble("Digite o código do produto: ");
    o1 = 0;
    o2 = 0;
    
    if (n1 <= 30)
    {
      System.out.println("Produto código: "+n2 +" Valor do desconto: R$0" +" Novo valor: R$"+n1);
    }
    else
    {
      if (n1 > 30 && n1 <= 100)
      {
        o1 = n1 * 0.10;
        o2 = n1 - o1;
        
        System.out.println("Produto código: "+n2 +" Valor do desconto: R$"+o1 +" Novo valor: R$"+o2);
      }
      else
      {
        if (n1 > 100)
        {
          o1 = n1 * 0.15;
          o2 = n1 - o2;
          
          System.out.println("Produto código: "+n2 +" Valor do desconto: R$"+o1 +" Novo valor: R$"+o2);
        }
      }
    }
  }
}
