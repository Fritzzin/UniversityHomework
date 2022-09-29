// Augusto Fritz
public class exer1
{
     public static void main(String[] args)
     {
          String nome = Entrada.leiaString("Digite seu nome");
          int y = nome.length();
          int x = 0;
          
          while (x < y && x < 10)
          {
               if(nome.charAt(x) != ' ')
               System.out.println(nome.charAt(x));
               x = x + 1;
          }
     }
}