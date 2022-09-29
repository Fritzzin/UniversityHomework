public class exercício3
{
     public static void main(String[] args)
     {
          int[] cod = {1,2,3,4,5,6,7,8,9,10};
          double[] codQuant = {10,10,10,10,10,10,10,10,10,10,};
          int cliente = 1;
          
          while (cliente != 0)
          {
               cliente = Entrada.leiaInt("Digite o código do cliente:");
               if (cliente != 0)
               {
                    int codProduto = Entrada.leiaInt("Digite o código do produto:");
                    double quant = Entrada.leiaDouble("Digite a quantidade:");
                    int posicao = existe(cod,codProduto);
                    if (posicao >= 0)
                    {
                         if(codQuant[posicao] >= quant)
                         {
                              codQuant[posicao] -= quant;
                              System.out.println("Pedido atendido. Obrigado e volte sempre!");
                         }
                         else
                         {
                              System.out.println("Não temos estoque suficiente dessa mercadoria!");
                         }
                    }
               }
          }
          System.out.println();
          for(int c=0;c<10;c++)
          {
               System.out.println("Produto "+cod[c]+" Estoque: "+codQuant[c]);
          }
     }
     
     
     
     public static int existe(int cod[] , int codProduto)
     {
          int pos=-1;
          for (int c=0;c<10;c++)
          {
               if (cod[c] == codProduto)
               {
                    pos = c;
               }
          }
          return pos;
     }
}