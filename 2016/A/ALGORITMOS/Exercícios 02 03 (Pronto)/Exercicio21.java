public class Exercicio21
{
  public static void main(String[] args)
  {
    double n1, n2;
    
    n1 = Entrada.leiaDouble ("Digite o pre�o:");
    n2 = Entrada.leiaDouble ("Digite o c�digo de origem:");
    
    if (n2 == 1)
    {
      System.out.println ("Valor do produto:"+n1 +"Proced�ncia: Sul");
    }
    else
    {
      if (n2 == 2)
      {
        System.out.println ("Valor do produto:"+n1 +"Proced�ncia: Norte");
      }
      else
      {
        if (n2 == 3)
        {
          System.out.println ("Valor do produto:"+n1 +"Proced�ncia: Leste");
        }
        else
        {
          if (n2 == 4)
          {
            System.out.println ("Valor do produto:"+n1 +"Proced�ncia: Oeste");
          }
          else
          {
            if (n2 == 5 && n2 == 6)
            {
              System.out.println ("Valor do produto:"+n1 +"Proced�ncia: Nordeste");
            }
            else
            {
              if (n2 >= 7 && n2 <= 9)
              {
                System.out.println ("Valor do produto:"+n1 +"Proced�ncia: Sudeste");
              }
              else
              {
                if (n2 >= 10 && n2 <= 20)
                {
                  System.out.println ("Valor do produto:"+n1 +"Proced�ncia: Centro-oeste");
                }
                else
                {
                  if (n2 >= 21 && n2 <= 30)
                  {
                    System.out.println ("Valor do produto:"+n1 +"Proced�ncia: Nordeste");
                  }
                  else
                  {
                    if (n2 > 30)
                    {
                      System.out.println ("C�digo inv�lido");
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
