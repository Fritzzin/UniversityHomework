public class exer03
{
     public static void main (String[] args)
     {
          double[][] n = new double[6][3];
          
          for (int c=0;c<6;c++)
          {
               for(int i=0;i<3;i++)
               {
                    n[c][i]=Entrada.leiaDouble("Digite o "+(i+1)+"º número da "+(c+1)+"ª linha:");
               }
          }
          
          double maior = n[0][0];
          int maiorL = 0;
          int maiorC = 0;
          double menor = n[0][0];
          int menorL = 0;
          int menorC = 0;
          
          for (int c=0;c<6;c++)
          {
               for (int i=0;i<3;i++)
               {
                    if (n[c][i] > maior)
                    {
                        maior = n[c][i];
                        maiorL = c;
                        maiorC = i;
                    }
                    if (n[c][i] < menor)
                    {
                         menor = n[c][i];
                         menorL =c;
                         menorC =i;
                    }
               }
          }
          System.out.println("Maior elemento : "+maior+" Linha: "+(maiorL+1)+" Coluna: "+(maiorC+1));
          System.out.println("Menor elemento : "+menor+" Linha: "+(menorL+1)+" Coluna: "+(menorC+1));
     }
}
