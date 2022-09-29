public class exer04
{
     public static void main (String[] args)
     {
          int[][] n = new int[15][5];
          String[] alunos = new String[15];
          
          for (int c=0;c<15;c++)
          {
               alunos[c] = Entrada.leiaString("Digite o nome do "+(c+1)+"º aluno:");
               for(int i=0;i<5;i++)
               {
                    n[c][i]=Entrada.leiaInt("Digite a nota da "+(i+1)+"ª prova");
               }
          }
          