public class Exercicio15
{
  public static void main(String[] args)
  {
    double n1, n2, o1;
    
    n1 = Entrada.leiaDouble("Tipo de investimento: \n"+
                            "1)Poupança \n"+
                            "2)Fundos de renda fixa \n");
    if (n1 !=1 && n1 !=2)
    {
      System.out.println("Digite um código válido");
    }
    else
    {
    n2 = Entrada.leiaDouble("Valor do investimento:");
    o1 = 0;
    
    if (n1 == 1)
    {
      o1 = n2 * 1.03;
      
      System.out.println("Valor: "+o1);
    }
    else
    {
      if (n1 == 2)
      {
        o1 = n2 * 1.04;
        
        System.out.println("Valor: "+o1);
      }
    }
    }
  }
}

