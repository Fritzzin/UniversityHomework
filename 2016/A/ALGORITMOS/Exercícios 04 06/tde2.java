/*
 * @Author: Augusto Fritz
 */

public class tde2
{
     public static void main(String[] args)
     {
          double v = Entrada.leiaDouble("Digite o valor do produto");
          double q = Entrada.leiaDouble("Digite a quantidade");
          char metodo = Entrada.leiaChar("M�todo de pagamento \n"+
                                         "A)� vista \n"+
                                         "B)A prazo");
          double vT = v * q;
          
          if (metodo != 'b' && metodo !='B' && metodo !='a' && metodo !='A')
          {
               System.out.println("Digite um m�todo v�lido!");
          }
          else
          {
               if (metodo == 'b' || metodo == 'B')
               {
                    double vP = vT * 1.03;
                    double vParcela = vP / 3;
                    System.out.println("Valor com acr�scimo: Em Reais: "+vP+" R$ ; D�lares: "+vP*3.80+" U$ ; Euros: "+vP*4.15+" �$");
                    System.out.println("Valor de cada parcela: Em Reais: "+vParcela+" R$ ; D�lares: "+vParcela*3.80+" U$ ; Euros: "+vParcela*4.15+" �$");
               }
               if (metodo == 'a' || metodo == 'A')
               {
                    System.out.println("Valor total: Em Reais: "+vT+" R$ ; D�lares: "+vT*3.80+" U$ ; Euros: "+vT*4.15+" �$");
               }
          }
     }
}
