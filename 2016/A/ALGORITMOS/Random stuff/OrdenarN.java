// Author: Auguto Fritz
public class OrdenarN
{
  public static void main(String[] args)
  {
    int n1, n2, n3, n4, a, b, c, d;
    
    n1 = Entrada.leiaInt("Digite o 1ºNúmero:");   
    n2 = Entrada.leiaInt("Digite o 2ºNúmero:");
    
    if (n1 > n2)
    {
      a = n2;
      b = n1;
    }
    else
    {
      a = n1;
      b = n2;
    }
    n3 = Entrada.leiaInt("Digite o 3ºNúmero:");
    
    if (n3 < a)
    {
      c = b;
      b = a;
      a = n3;
    }
    else
    {
      if (n3 < b && n3 > a)
      {
        c = b;
        b = n3;
      }
      else
      {
        c = n3;
      }
    }
    n4 = Entrada.leiaInt("Digite o 4ºNúmero:");
    
    if (n4 < a)
    {
      d = c;
      c = b;
      b = a;
      a = n4;
    }
    else
    {
      if (n4 < b)
      {
        d = c;
        c = b;
        b = n4;
      }
      else
      {
        if (n4 < c)
        {
          d = c;
          c = n4;
        }
        else
        {
          d = n4;
        }
      }
    }
    System.out.println("Primeiro :"+a);
    System.out.println("Segundo :"+b);
    System.out.println("Terceiro :"+c);
    System.out.println("Quarto :"+d);
  }
}
