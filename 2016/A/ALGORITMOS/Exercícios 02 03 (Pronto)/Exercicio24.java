public class Exercicio24
{
  public static void main(String[] args)
  {
    double n1, n2, o1, o2, o3, o4;
    char n3;
    
    n1 = Entrada.leiaDouble ("Digite o preço:");
    n2 = Entrada.leiaDouble ("Digite a categoria: \n"+
                             "1)Limpeza \n"+
                             "2)Alimentação \n"+
                             "3)Vestuário ");
    
    
    
    if (n2 != 1 && n2 != 2 && n2 != 3)
    {
      System.out.println("Digite uma categoria válida!");
    }
    else
    {
      
      n3 = Entrada.leiaChar ("Situação: \n"+
                             "R-Necessita de refrigeração \n"+
                             "N-Não necessita de refrigeração");
      o1 = 0;
      
      if (n3 != 'r' && n3 != 'n')
      {
        System.out.println("Digite uma situação válida!");
      }
      else
      {
        if (n1 <= 25 && n2 == 1)
        {
          o1 = n1 * 0.05;
        }
        else
        {
          if (n1 <= 25 && n2 == 2)
          {
            o1 = n1 * 0.08;
          }
          else
          {
            if (n1 <= 25 && n2 == 3)
            {
              o1 = n1 * 0.10;
            }
            if (n1 > 25 && n2 == 1)
            {
              o1 = n1 * 0.12;
            }
            else
            {
              if (n1 > 25 && n2 == 2)
              {
                o1 = n1 * 0.15;
              }
              else
              {
                if (n1 > 25 && n2 == 3)
                {
                  o1 = n1 * 0.18;
                }
              }
            }
          }
        }
        System.out.println("Valor do aumento: "+o1);
        
        if (n2 == 2 && n3 == 'r')
        {
          o2 = o1 + n1;
          o3 = o2 * 0.05;
        }
        else
        {
          o2 = o1 + n1;
          o3 = o2 * 0.08;
        }
        System.out.println("Valor do Imposto: "+o3);
        
        o4 = o2 - o3;
        System.out.println("Valor Total: "+o4);
        
        if (o4 <= 50)
        {
          System.out.println("Classificação: Barato");
        }
        else
        {
          if (o4 > 50 && o4 < 120)
          {
            System.out.println("Classificação: Normal");
          }
          else
          {
            if (o4 >= 120)
            {
              System.out.println("Classificação: Caro");
            }
          }
        }
      }
    }
  }
}

