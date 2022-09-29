public class Matrizes
{
     public static void main (String[] args)
     {
          double[][] nota = new double[10][3];
          double[] soma = new double[10];
          
          for (int c=0;c<10;c++)
          {
               for(int i=0;i<3;i++)
               {
                    nota[c][i]=Entrada.leiaDouble("Digite a "+(i+1)+"ª nota da "+(c+1)+"º atleta:");
                    soma[c] += nota[c][i];
               }
          }
          
          for (int c=0;c<10;c++)
          {
               System.out.println((c+1)+"º Atleta : "+nota[c][0]+" | "+nota[c][1]+" | "+nota[c][2]+" Média : "+(soma[c]/3));
          }
     }
}


         
               
               
               