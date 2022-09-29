public class exercício11
{
     public static void main(String[] args)
     {
          int[] n = new int[10];
          String par = "";
          String impar = "";
          for(int c=0;c<10;c++)
          {
               n[c] = Entrada.leiaInt("Digite o "+(c+1)+"º número");
               if (n[c] % 2 == 0)
               {
                    par += n[c]+ " ";
               }
               else
               {
                    impar += n[c]+ " ";
               }
          }
          
          System.out.println("Par(es): "+par);
          System.out.println("Impar(es): "+impar);
     }
}  
