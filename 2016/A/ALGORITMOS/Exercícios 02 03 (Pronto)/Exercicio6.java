public class Exercicio6
{
  public static void main(String[] args)
  {
    double n1, n2, o1, o2, o3, o4, o5;
    char n3;
    
    n1 = Entrada.leiaDouble("Digite o 1� n�mero:");
    n2 = Entrada.leiaDouble("Digite o 2� n�mero:");
    n3 = Entrada.leiaChar("Digite uma op��o\n"+
                            "a) O primeiro n�mero elevado ao segundo n�mero\n"+
                            "b) Raiz quadrada de cada um dos n�meros.\n"+
                            "c) Raiz c�bica de cada um dos n�meros. \n");
    
    if (n3 == 'a')
    {
      o1 = Math.pow(n1,n2);
      
      System.out.println("O resultado da pot�ncia �: "+o1);
    }
    else
    {
      if (n3 == 'b')
      {
        o2 = Math.sqrt(n1);
        o3 = Math.sqrt(n2);
        
        System.out.println("Os resultados das ra�zes s�o: "+o2 +" e "+o3);
      }
      else
      {
        if (n3 == 'c')
        {
          o4 = Math.cbrt(n1);
          o5 = Math.cbrt(n2);
          
          System.out.println("Os resultados das ra�zes s�o: "+o4 +" e "+o5);
        }
        else
        {
          if(n3 != 'a' && n3 != 'b' && n3 != 'c')
          {
            System.out.println("Erro! Digite uma op��o v�lida!");
          }
        }
      }
    }
  }
}

