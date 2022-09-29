// Augusto Fritz
public class exer2
{
     public static void main(String[] args)
     {
          String nome = Entrada.leiaString("Digite seu nome");
          int y = nome.length();
          int x = y - 1;   
          
          while (x >= 0)
          {
               System.out.println(nome.charAt(x));
               x = x - 1;
          }
     }
}