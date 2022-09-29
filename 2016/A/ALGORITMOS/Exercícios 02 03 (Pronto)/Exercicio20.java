public class Exercicio20
{
  public static void main(String[] args)
  {
    double n1;
    
    n1 = Entrada.leiaDouble ("Digite a idade do nadador: \n"+
                             "Infantil: 5 a 7 \n"+
                             "Juvenil: 8 a 10 \n"+
                             "Adolescente: 11 a 15 \n"+
                             "Adulto: 16 a 30 \n"+
                             "Sênior: Mais de 30 \n");
    
    if (n1 < 5)
    {
      System.out.println ("Não há categorias para esta idade.");
    }
    else
    {
      if (n1 >= 5 && n1 <= 7)
      {
        System.out.println ("Categoria: Infantil");
      }
      else
      {
        if (n1 >= 8 && n1 <= 10)
        {
          System.out.println ("Categoria: Juvenil");
        }
        else
        {
          if (n1 >= 11 && n1 <= 15)
          {
            System.out.println ("Categoria: Adolescente");
          }
          else
          {
            if (n1 >= 16 && n1 <= 30)
            {
              System.out.println ("Categoria: Adulto");
            }
            else
            {
              if (n1 > 30)
              {
                System.out.println ("Categoria: Sênior");
              }
            }
          }
        }
      }
    }
  }
}