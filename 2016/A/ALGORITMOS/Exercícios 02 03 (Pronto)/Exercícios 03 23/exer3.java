// Augusto Fritz
public class exer3
{
     public static void main(String[] args)
     {
          String nome = Entrada.leiaString("Digite uma frase");
          int y = nome.length();
          int x = 0;
          int a = 0;
          while (x < y)
          {
               if (nome.charAt(x)=='a' || nome.charAt(x)=='A')
               {
                    a = a + 1;
               }
               else
               {
               }
               
               x = x + 1;
          }
          System.out.println("A letra (a) repetiu: "+a +" vezes nesta frase : "+nome);
     }
}
