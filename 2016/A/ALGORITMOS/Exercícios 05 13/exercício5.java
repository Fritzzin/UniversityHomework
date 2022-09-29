public class exercício5
{
     public static void main(String[] args)
     {
          int[] logica = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
          int[] linguagem = {2,4,6,8,10,12,14,16,18,20};
          
          String verificar = iguais(logica,linguagem);
          
          System.out.println("Cursam ambas as disciplinas os alunos: "+verificar);
     }
     
     
     public static String iguais(int[] logica, int[] linguagem)
     {
          String igual = "";
          int x = 0;
          while (x<10)
          { 
               for (int c=0;c<15;c++)
               {
                    if(linguagem[x] == logica[c])
                    {
                         igual = igual + " " + linguagem[x];
                    }
               }
               x += 1;
          }
          return igual;
     }
}