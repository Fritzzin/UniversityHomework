public class exer17
{
     public static void main (String[] args)
     {
          double[][] n = new double[10][10];
          double media = 0;
          
          for (int c=0;c<10;c++)
          {
               for(int i=0;i<10;i++)
               {
                    n[c][i]=Entrada.leiaInt("Digite o "+(i+1)+"� n�mero da "+(c+1)+"� linha:");
                    if(c == i)
                    {
                         media += n[c][i];
                    }
               } 
          }
          System.out.println("M�dia da diagonal principal = "+(media/10));
     }
}

