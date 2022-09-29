// Augusto Fritz
public class exerRandom2
{
     public static void main(String[] args)
     {
          String nome = Entrada.leiaString("Digite seu nome");
          int x = 0;
          int y = nome.length();
          
          while (x < y);
          {
               System.out.println(nome.charAt(x));
               x = x + 1;
          }
     }
}