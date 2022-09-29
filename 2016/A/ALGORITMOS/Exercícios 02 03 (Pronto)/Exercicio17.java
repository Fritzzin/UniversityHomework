public class Exercicio17
{
  public static void main(String[] args)
  {
    double n1;
    
    n1 = Entrada.leiaDouble ("Digite a senha:");
    
    if (n1 != 4531)
    {
      System.out.println ("Acesso foi negado!");
    }
    else
    {
      System.out.println ("Acesso permitido!");
    }
  }
}