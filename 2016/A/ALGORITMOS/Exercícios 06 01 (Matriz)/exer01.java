public class exer01
{
     public static void main (String[] args)
     {
          int[][] n = new int[3][5];
          int contador = 0;
          
          for (int c=0;c<3;c++)
          {
               for(int i=0;i<5;i++)
               {
                    n[c][i]=Entrada.leiaInt("Digite o "+(i+1)+"º número da "+(c+1)+"ª linha:");
                    if(n[c][i] > 15 && n[c][i] < 20)
                    {
                         contador++;
                    }                        
               }
          }
          
          System.out.println("Quantidade de elementos entre 15 e 20 : "+contador);
     }
}
