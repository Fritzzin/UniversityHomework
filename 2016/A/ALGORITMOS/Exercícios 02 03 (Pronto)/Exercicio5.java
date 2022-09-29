public class Exercicio5
{
  public static void main(String[] args)
  {
    double n1, n2, n3, o1, o2, o3, o4, o5;
    n1 = Entrada.leiaDouble("Digite o 1º número:");
    n2 = Entrada.leiaDouble("Digite o 2º número:");
    n3 = Entrada.leiaDouble("Digite o código da operação:\n"+
                            "1) Média de dois números\n"+
                            "2) Diferença do maior número para o menor\n"+
                            "3) Produto dos números digitados\n"+
                            "4) Divisão do primeiro pelo segundo\n");
    
    if (n3 == 1)
    {
      o1 = (n1 + n2) / 2;
      
      System.out.println("A média é:"+o1);
    }
    else
    {
      if (n3 == 2)
      {
        if (n1>n2)
        {
          o2 = n1 - n2;
          
          System.out.println("A diferença é:"+o2);
        }
        else
        {
          o3 = n2 - n1;
          
          System.out.println("A diferença é:"+o3);
        }
      }
      if (n3 == 3)
      {
        o4 = n1 * n2;
        
        System.out.println("O produto é:"+o4);
      }
      else
      {
        if (n3 == 4 && n2 == 0)
        {          
          System.out.println("Erro, o segundo valor não pode ser zero!");
          
        }
        else
        {
          if (n3 == 4)
          {
            
          o5 = n1 / n2;
          
          System.out.println("O valor da divisão é:"+o5);
          }
        {
          if (n3 > 4)
          {
            System.out.println("Erro, você digitou um código inválido!");
          }
        }
      }
    }
    }
  }
}



          