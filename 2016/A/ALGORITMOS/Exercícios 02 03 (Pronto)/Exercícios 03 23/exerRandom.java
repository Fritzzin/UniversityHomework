// Augusto Fritz
public class exerRandom
{
     public static void main(String[] args)
     {
          String nome = Entrada.leiaString("Digite seu nome");
          
          if (nome.charAt(0) == 'A' || nome.charAt(0) == 'a')
          {
               System.out.println("O nome come�a por A.");
          }
          else
          {
               System.out.println("O nome n�o come�a por A.");
          }
     }
}
