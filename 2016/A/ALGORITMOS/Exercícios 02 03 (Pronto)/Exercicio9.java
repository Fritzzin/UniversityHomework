public class Exercicio9
{
  public static void main(String[] args)
  {
    double n1, o1, o2, o3, o4;
    
    n1 = Entrada.leiaDouble("Digite o saldo m�dio do cliente:");
    
    
      if (n1 < 400 && n1 >= 300)
      {
        o2 = n1 * 1.25;
        
        System.out.println("Saldo m�dio: "+n1 +" Cr�dito: "+o2);
      }
      else
      {
        if (n1 < 300 && n1 >= 200)
        { 
          o3 = n1 * 1.20;
          
          System.out.println("Saldo m�dio: "+n1 +" Cr�dito: "+o3);
        }
        else
        {
          if (n1 < 200)
          {
            o4 = n1 * 1.10;
            
            System.out.println("Saldo m�dio: "+n1 +" Cr�dito: "+o4);
          }
          else
          {
            o1 = n1 * 1.30;
            System.out.println("Saldo m�dio: "+n1 +" Cr�dito: "+o1);
          }
        }
      }
  }
}
