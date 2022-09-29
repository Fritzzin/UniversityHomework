// Augusto Fritz
public class exerRandom
{
     public static void main(String[] args)
     {
          String nome = Entrada.leiaString("Digite seu nome");
          
          if (nome.charAt(0) == 'A' || nome.charAt(0) == 'a')
          {
               System.out.println("O nome começa por A.");
          }
          else
          {
               System.out.println("O nome não começa por A.");
          }
     }
}
