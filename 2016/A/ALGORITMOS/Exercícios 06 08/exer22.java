public class exer22
{
     public static void main (String[] args)
     {
          double[][] n = new double[6][10];
          double[] soma = new double[10];
          
          for (int c=0;c<10;c++)
          {
               for(int i=0;i<6;i++)
               {
                    n[i][c]=Entrada.leiaDouble("Digite o "+(i+1)+"º número da "+(c+1)+"ª coluna:");
                    soma[c] += n[i][c];
               }
          }
          for (int c=0;c<6;c++)
          {
               for(int i=0;i<10;i++)
               {
                   System.out.print(n[c][i]+"  ");
               }
               System.out.println();
          }
          for (int c=0;c<10;c++)
          {
              System.out.print(soma[c]+"  ");
          }
     }
}
