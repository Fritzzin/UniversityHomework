/*
 * @Author: Augusto Fritz
 */

public class tde4
{
     public static void main(String[] args)
     {
          double dist = Entrada.leiaDouble("Digite a dist�ncia(Km) percorrida:");
          double comb = Entrada.leiaDouble("Quantidade de combust�vel utilizada:");
          
          double media = dist / comb;
          
          if (media > 12)
          {
               System.out.println ("M�dia: "+media+" Km/l. O carro � econ�mico.");
          }
          else
          {
               System.out.println("M�dia: "+media+" Km/l. O carro n�o � econ�mico.");
          }
     }
}
