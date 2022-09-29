public class Exercicio21
{
  public static void main(String[] args)
  {
    double n1, n2;
    
    n1 = Entrada.leiaDouble ("Digite o preço:");
    n2 = Entrada.leiaDouble ("Digite o código de origem:");
    
    if (n2 == 1)
    {
      System.out.println ("Valor do produto:"+n1 +"Procedência: Sul");
    }
    else
    {
      if (n2 == 2)
      {
        System.out.println ("Valor do produto:"+n1 +"Procedência: Norte");
      }
      else
      {
        if (n2 == 3)
        {
          System.out.println ("Valor do produto:"+n1 +"Procedência: Leste");
        }
        else
        {
          if (n2 == 4)
          {
            System.out.println ("Valor do produto:"+n1 +"Procedência: Oeste");
          }
          else
          {
            if (n2 == 5 && n2 == 6)
            {
              System.out.println ("Valor do produto:"+n1 +"Procedência: Nordeste");
            }
            else
            {
              if (n2 >= 7 && n2 <= 9)
              {
                System.out.println ("Valor do produto:"+n1 +"Procedência: Sudeste");
              }
              else
              {
                if (n2 >= 10 && n2 <= 20)
                {
                  System.out.println ("Valor do produto:"+n1 +"Procedência: Centro-oeste");
                }
                else
                {
                  if (n2 >= 21 && n2 <= 30)
                  {
                    System.out.println ("Valor do produto:"+n1 +"Procedência: Nordeste");
                  }
                  else
                  {
                    if (n2 > 30)
                    {
                      System.out.println ("Código inválido");
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
