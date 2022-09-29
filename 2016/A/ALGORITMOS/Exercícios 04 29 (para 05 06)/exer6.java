/*
 * @Author: Augusto Fritz
 */

public class exer6
{
     public static void main(String[] args)
     {
          String[] vendedor = new String[3];
          double[] totalV = new double[3];
          double[] percentual = new double[3];
          double[] comissao = new double[3];
          double total = 0;
          
          for (int c=0 ; c<3 ; c++)
          {
               vendedor[c] = Entrada.leiaString("Digite o nome do "+(c+1)+"º vendedor:");
               totalV[c] = Entrada.leiaDouble("Digite o valor total das vendas deste vendedor:");
               percentual[c] = Entrada.leiaDouble("Digite o percentual de comissão que este vendedor receberá:");
               
               comissao[c] = totalV[c] * (percentual[c] / 100);
               total = total + comissao[c];   
               System.out.println("O vendedor(a): "+vendedor[c]+" receberá R$"+comissao[c]+" , equivalente a "+percentual[c]+"% da comissão.");
          }
          