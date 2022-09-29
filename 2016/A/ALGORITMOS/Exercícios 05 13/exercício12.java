public class exercício12
{
     public static void main(String[] args)
     {
          int [] n = new int[5];
          String conta = "";
          int soma = 0;
          
          for(int c=0;c<5;c++)
          {
               n[c] = Entrada.leiaInt("Digite o "+(c+1)+"º número:");
               if(c<4)
               {
                    conta += n[c] + " + ";
               }
               else
               {
                     conta += n[c];
               }
               soma += n[c];
          }
          
          System.out.println("Os números digitados foram: "+conta+" = "+soma);
     }
}