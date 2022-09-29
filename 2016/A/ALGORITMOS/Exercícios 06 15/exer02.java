public class exer02
{
     public static void main(String[] args)
     {
          int n = 1;
          
          n = Entrada.leiaInt("Digite um número inteiro:");
          while(n != 0)
          { 
               System.out.println(n +" possui "+divisores(n)+" divisores.");
               n = Entrada.leiaInt("Digite um número inteiro:");
          }
     }
     
     public static int divisores (int n)
     {     
          int divisores = 0;
          for (int c=1; c <= n ; c++)
          {
               if(n % c == 0)
               {
                    divisores ++;
               }
          }
          return divisores;
     }
}