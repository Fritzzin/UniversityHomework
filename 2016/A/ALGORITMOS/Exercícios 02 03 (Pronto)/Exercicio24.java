public class Exercicio24
{
  public static void main(String[] args)
  {
    double n1, n2, o1, o2, o3, o4;
    char n3;
    
    n1 = Entrada.leiaDouble ("Digite o pre�o:");
    n2 = Entrada.leiaDouble ("Digite a categoria: \n"+
                             "1)Limpeza \n"+
                             "2)Alimenta��o \n"+
                             "3)Vestu�rio ");
    
    
    
    if (n2 != 1 && n2 != 2 && n2 != 3)
    {
      System.out.println("Digite uma categoria v�lida!");
    }
    else
    {
      
      n3 = Entrada.leiaChar ("Situa��o: \n"+
                             "R-Necessita de refrigera��o \n"+
                             "N-N�o necessita de refrigera��o");
      o1 = 0;
      
      if (n3 != 'r' && n3 != 'n')
      {
        System.out.println("Digite uma situa��o v�lida!");
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
          System.out.println("Classifica��o: Barato");
        }
        else
        {
          if (o4 > 50 && o4 < 120)
          {
            System.out.println("Classifica��o: Normal");
          }
          else
          {
            if (o4 >= 120)
            {
              System.out.println("Classifica��o: Caro");
            }
          }
        }
      }
    }
  }
}

