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
                    nota[c][i]=Entrada.leiaInt("Digite o "+(i+1)+"º número da "+(c+1)+"ª linha:");
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
               System.out.println((c+1)+"ª linha possui :"+contador[c]+"  números entre 12 e 20.");
          }
          System.out.println("Média dos elementos pares: "+(soma/pares));
     }
}
