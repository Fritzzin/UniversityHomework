public class Exercicio25
{
  public static void main(String[] args)
  {
    double n1,n2,o1,o2;
    
    n1 = Entrada.leiaDouble("N�mero de horas extras trabalhadas:");
    n2 = Entrada.leiaDouble("N�mero de horas faltadas:");   
    
    o1 = n1 - ((2.0 / 3.0) * n2);
    o2 = o1 * 60;
    
    if (o2  >= 2400)
    {
      System.out.println("N�mero de minutos: "+o2 +" Pr�mio: 500R$");
    }
    else
    {
      if (o2 >= 1800 && o2 < 2400)
      {
        System.out.println("N�mero de minutos: "+o2 +" Pr�mio: 400R$");
      }
      else
      {
        if (o2 >= 1200 && o2 < 1800)
        {
          System.out.println("N�mero de minutos: "+o2 +" Pr�mio: 300R$");
        }
        else
        {
          if (o2 >= 600 && o2 < 1200)
          {
            System.out.println("N�mero de minutos: "+o2 +" Pr�mio: 200R$");
          }
          else
          {
            if (o2 < 600)
            {
              System.out.println("N�mero de minutos: "+o2 +" Pr�mio: 100R$");
            }
          }
        }
      }
    }
  }
}
