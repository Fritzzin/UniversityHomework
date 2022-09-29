public class exer15
{
     public static void main (String[] args)
     {
          double[][] n = new double[12][13];
          double[][] n2= new double[12][13];
          
          for (int c=0;c<12;c++)
          {
               for(int i=0;i<13;i++)
               {
                    n[c][i]=Entrada.leiaDouble("Digite o "+(i+1)+"º número da "+(c+1)+"ª linha:");
               }
               double maior = n[c][0];
               for(int j=1;j<13;j++)
               {
                    if (n[c][j] > maior)
                    {
                         maior = n[c][j];
                    }
               }
               for(int f=0;f<13;f++)
               {
                    n2[c][f] = (n[c][f] / Math.abs(maior));
               }
          }
          
          System.out.println("MATRIZ LIDA");
          for (int c=0;c<12;c++)
          {
               for(int i=0;i<13;i++)
               {
                    System.out.print(n[c][i]+"  ");                    
               }
               System.out.println();
          }
          System.out.println();
          
          System.out.println("MATRIZ MODIFICADA");
          for (int c=0;c<12;c++)
          {
               for(int i=0;i<13;i++)
               {
                    System.out.print(n2[c][i]+"  ");                    
               }
               System.out.println();
          }
     }
}

               
               