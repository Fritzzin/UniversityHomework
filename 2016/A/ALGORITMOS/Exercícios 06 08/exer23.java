public class exer23
{
     public static void main (String[] args)
     {
          double[][] n = new double[3][4];
          int pares = 0;
          double impares = 0;
          double soma = 0;
          
          for (int c=0;c<3;c++)
          {
               for(int i=0;i<4;i++)
               {
                    n[c][i]=Entrada.leiaDouble("Digite o "+(i+1)+"� n�mero da "+(c+1)+"� linha:");
                    soma += n[c][i];
                    if (n[c][i]%2==0)
                    {
                        pares++;
                    }
                    else
                    {
                        impares += n[c][i];
                    }
               }
          }
          System.out.println("Quantidade de Pares : "+pares);
          System.out.println("Soma dos �mpares : "+impares);
          System.out.println("M�dia de todos os elementos : "+(soma/12));
     }
}

               