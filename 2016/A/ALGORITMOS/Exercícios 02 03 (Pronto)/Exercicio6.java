public class Exercicio6
{
  public static void main(String[] args)
  {
    double n1, n2, o1, o2, o3, o4, o5;
    char n3;
    
    n1 = Entrada.leiaDouble("Digite o 1º número:");
    n2 = Entrada.leiaDouble("Digite o 2º número:");
    n3 = Entrada.leiaChar("Digite uma opção\n"+
                            "a) O primeiro número elevado ao segundo número\n"+
                            "b) Raiz quadrada de cada um dos números.\n"+
                            "c) Raiz cúbica de cada um dos números. \n");
    
    if (n3 == 'a')
    {
      o1 = Math.pow(n1,n2);
      
      System.out.println("O resultado da potência é: "+o1);
    }
    else
    {
      if (n3 == 'b')
      {
        o2 = Math.sqrt(n1);
        o3 = Math.sqrt(n2);
        
        System.out.println("Os resultados das raízes são: "+o2 +" e "+o3);
      }
      else
      {
        if (n3 == 'c')
        {
          o4 = Math.cbrt(n1);
          o5 = Math.cbrt(n2);
          
          System.out.println("Os resultados das raízes são: "+o4 +" e "+o5);
        }
        else
        {
          if(n3 != 'a' && n3 != 'b' && n3 != 'c')
          {
            System.out.println("Erro! Digite uma opção válida!");
          }
        }
      }
    }
  }
}

