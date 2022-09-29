/*
 * @Author: Augusto Fritz
 */

public class exercicioExemplo
{
     public static void main(String[] args)
     {
          String[] n = new String[10];
          
          for (int c=0;c<10;c++)
          {
               n[c] = Entrada.leiaString("Digite um nome");
          }
          
          for (int c=9;c>=0;c--)
          {
               System.out.println(n[c]);
               
          }
     }
}