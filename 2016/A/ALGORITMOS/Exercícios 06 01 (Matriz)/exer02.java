public class exer02
{
     public static void main (String[] args)
     {
          int[][] nota = new int[2][4];
          int[] contador = new int[8];
          int pares = 0;
          int soma = 0;
          
          for (int c=0;c<2;c++)
          {
               for(int i=0;i<4;i++)
               {
                    nota[c][i]=Entrada.leiaInt("Digite o "+(i+1)+"� n�mero da "+(c+1)+"� linha:");
                    if(nota[c][i] > 12 && nota[c][i] < 20)
                    {
                         contador[c]++;
                    }
                    if(nota[c][i] % 2 == 0)
                    {
                         soma += nota[c][i];
                         pares++;
                    }
               }
          }
          for(int c=0;c<2;c++)
          {
               System.out.println((c+1)+"� linha possui :"+contador[c]+"  n�meros entre 12 e 20.");
          }
          System.out.println("M�dia dos elementos pares: "+(soma/pares));
     }
}
