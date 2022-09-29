/*
 * @Author: Augusto Fritz
 */

public class exer13
{
     public static void main(String[] args)
     {
         String[] nome = new String[8];
         double[] nota = new double[8];
         double soma = 0;
         
         for (int c=0;c<8;c++)
         {
             nome[c] = Entrada.leiaString("Digite o nome do "+(c+1)+"º aluno:");
             nota[c] = Entrada.leiaDouble("Digite a nota do(a) "+(nome[c])+" :");
             
         }
         
         System.out.println("Relatório de notas:");
         
         for (int c=0;c<8;c++)
         {
             System.out.println(nome[c]+" "+nota[c]);
             soma = soma + nota[c];
         }
         System.out.println("Média da classe = "+(soma / 8));
     }
}
                            
                            