public class Exercicio5
{
  public static void main(String[] args)
  {
    double n1, n2, n3, o1, o2, o3, o4, o5;
    n1 = Entrada.leiaDouble("Digite o 1� n�mero:");
    n2 = Entrada.leiaDouble("Digite o 2� n�mero:");
    n3 = Entrada.leiaDouble("Digite o c�digo da opera��o:\n"+
                            "1) M�dia de dois n�meros\n"+
                            "2) Diferen�a do maior n�mero para o menor\n"+
                            "3) Produto dos n�meros digitados\n"+
                            "4) Divis�o do primeiro pelo segundo\n");
    
    if (n3 == 1)
    {
      o1 = (n1 + n2) / 2;
      
      System.out.println("A m�dia �:"+o1);
    }
    else
    {
      if (n3 == 2)
      {
        if (n1>n2)
        {
          o2 = n1 - n2;
          
          System.out.println("A diferen�a �:"+o2);
        }
        else
        {
          o3 = n2 - n1;
          
          System.out.println("A diferen�a �:"+o3);
        }
      }
      if (n3 == 3)
      {
        o4 = n1 * n2;
        
        System.out.println("O produto �:"+o4);
      }
      else
      {
        if (n3 == 4 && n2 == 0)
        {          
          System.out.println("Erro, o segundo valor n�o pode ser zero!");
          
        }
        else
        {
          if (n3 == 4)
          {
            
          o5 = n1 / n2;
          
          System.out.println("O valor da divis�o �:"+o5);
          }
        {
          if (n3 > 4)
          {
            System.out.println("Erro, voc� digitou um c�digo inv�lido!");
          }
        }
      }
    }
    }
  }
}



          