public class exer20
{
     public static void main (String[] args)
     {
          double[][] n = new double[5][5];
          
          for (int c=0;c<5;c++)
          {
               for(int i=0;i<5;i++)
               {
                    n[c][i]=Entrada.leiaInt("Digite o "+(i+1)+"º número da "+(c+1)+"ª linha:");
               }
          }
          double maior = n[0][0];
          for (int c=0;c<5;c++)
          {
               for (int i=0;i<5;i++)
               {
                    if (n[c][i] > maior)
                    {
                         maior = n[c][i];
                    }
               }
          }
          for (int c=0;c<5;c++)
          {
               n[c][c] = (n[c][c] * maior);
          }
          System.out.println("MATRIZ RESULTANTE");
          for (int c=0;c<5;c++)
          {
               for(int i=0;i<5;i++)
               {
                    System.out.print(n[c][i]+"  ");
               }
               System.out.println();
          }
     }
}

          