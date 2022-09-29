/*
 * @Author: Augusto Fritz
 */

public class tde4
{
     public static void main(String[] args)
     {
          double dist = Entrada.leiaDouble("Digite a distância(Km) percorrida:");
          double comb = Entrada.leiaDouble("Quantidade de combustível utilizada:");
          
          double media = dist / comb;
          
          if (media > 12)
          {
               System.out.println ("Média: "+media+" Km/l. O carro é econômico.");
          }
          else
          {
               System.out.println("Média: "+media+" Km/l. O carro não é econômico.");
          }
     }
}
