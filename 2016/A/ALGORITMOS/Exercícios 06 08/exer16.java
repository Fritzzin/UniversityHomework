public class exer16
{
     public static void main (String[] args)
     {
          double[][] n = new double[5][5];
          double[] v1 = new double[5];// soma das linhas
          double[] v2 = new double[5];// soma das colunas
          
          for (int c=0;c<5;c++)
          {
               for(int i=0;i<5;i++)
               {
                    n[c][i]=Entrada.leiaInt("Digite o "+(i+1)+"º número da "+(c+1)+"ª linha:");
                    v1[c] += n[c][i];
               }
               
          }
          for (int c=0;c<5;c++)
          {
               for(int i=0;i<5;i++)          
               {
                    v2[c] += n[i][c];
               }
          }
          
          System.out.println("MATRIZ");
          for (int c=0;c<5;c++)
          {
               for(int i=0;i<5;i++)
               {
                    System.out.print(n[c][i]+"  ");
               }
               System.out.println();
          }
          System.out.println();
          for (int c=0;c<5;c++)
          {
               System.out.println("Soma da linha"+(c+1)+" = "+v1[c]);
          }
          System.out.println();
          for (int c=0;c<5;c++)
          {
               System.out.println("Soma da coluna"+(c+1)+" = "+v2[c]);
          }
     }
}

