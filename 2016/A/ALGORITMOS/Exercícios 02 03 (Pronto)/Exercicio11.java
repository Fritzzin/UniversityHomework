public class Exercicio11
{
  public static void main(String[] args)
  {
    double n1, o1, o2, o3, o4, o5, o6;
    
    n1 = Entrada.leiaDouble("Digite o sal�rio do funcion�rio: ");
    
    if (n1 <= 300)
    {
      o1 = n1 * 0.15;
      o2 = n1 + o1;
      
      System.out.println("Valor do aumento: "+o1 +" Novo sal�rio: "+o2);
    }
    else
    {
      if (n1 > 300 && n1 <= 600)
      {
        o3 = n1 * 0.10;
        o4 = n1 + o3;
        
        System.out.println("Valor do aumento: "+o3 +" Novo sal�rio: "+o4);
      }
      else
      {
        if (n1 > 600 && n1 <= 900)
        {
          o5 = n1 * 0.05;
          o6 = n1 + o5;
          
          System.out.println("Valor do aumento: "+o5 +" Novo sal�rio: "+o6);
        }
        else
        {
          if (n1 > 900)
          {
            System.out.println("N�o h� aumento para valores maiores que 900. Sal�rio: "+n1);
          }
        }
      }
    }
  }
}
