public class exer19
{
     public static void main (String[] args)
     {
          int[][] n = new int[8][6];
          int[] media = new int[8];
          int[]numeroLinha = new int [8];
          int contador = 0;
          
          
          for (int c=0;c<8;c++)
          {   
               for(int i=0;i<6;i++)
               {
                    n[c][i]=Entrada.leiaInt("Digite o "+(i+1)+"º número da "+(c+1)+"ª linha:");
                    
                    if ((c+1)>0 && (c+1)%2==0)
                    {
                         media[contador] += n[c][i];
                    }
               }
               if((c+1)>0 && (c+1)%2==0)
               {
                    numeroLinha[contador] = c;
                    contador++;
                    
               }
          }
          for (int c=0;c<contador;c++)
          {
               System.out.println("Média da linha "+(numeroLinha[c]+1)+" = "+(media[c] / 6));
          }
     }
}


