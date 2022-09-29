/*
 * @Author: Augusto Fritz
 */

public class desafioFibonacci
{
     public static void main(String[] args)
     {
          System.out.println("0");
          System.out.println("1");
          int cont = 0;
          int n1 = 0;
          int n2 = 1;
          int resposta = 0;
          while (cont < 8)
          {
               cont = cont + 1; 
               resposta = n1 + n2; 
               n1 = n2;
               n2 = resposta;
               System.out.println(resposta);
               
          }
     }
}
               
          