public class Exercicio19
{
  public static void main(String[] args)
  {
    double n1, n2, o1;
    
    n1 = Entrada.leiaDouble ("Digite o altura:");
    n2 = Entrada.leiaDouble ("Digite o sexo: \n"+
                             "1)Homem \n"+
                             "2)Mulhere \n");
    o1 = 0;
    
    
    if (n2 == 1)
    {
      o1 = (72.7 * n1) - 58;
      System.out.println ("O peso ideal é: "+o1);
    }
    else
    {
      if (n2 == 2)
      {
        o1 = (62.1 * n1) - 44.7;
        System.out.println ("O peso ideal é "+o1);
      }
      else
      {
        if (n2 !=1 && n2 !=2)
        {
          System.out.println ("Digite um código válido!");
        }
      }
    }
  }
}