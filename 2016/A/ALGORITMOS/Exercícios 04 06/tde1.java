/*
 * @Author: Augusto Fritz
 */

public class tde1
{
     public static void main(String[] args)
     {
          double nota = 0;
          double peso = 0;
          double media = 0;
          for(int c = 0;c < 3;c++)
          {
               double n = Entrada.leiaDouble("Digite a nota");
               double p = Entrada.leiaDouble("Digite o peso da nota");
               
               nota = nota + (n * p);
               peso = peso + p;
          }
          System.out.println(nota / peso);
     }
}

               
              