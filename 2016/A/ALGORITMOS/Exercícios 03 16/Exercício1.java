// Augusto Fritz
public class Exercício1
{
     public static void main(String[] args)
     {
          int opcao;
          double num1,num2,num3;
          double op1,op2,op3;
          
          opcao = Entrada.leiaInt("Digite uma opção: \n"+
                                  "1. Média Harmônica \n"+
                                  "2. Média Geométrica \n"+
                                  "3. Média Aritmética Simples");
          
          num1 = Entrada.leiaDouble("Digite o 1º número");
          num2 = Entrada.leiaDouble("Digite o 2º número");
          num3 = Entrada.leiaDouble("Digite o 3º número");
          
          if (opcao == 1)
          {
               op1 = 3 / ((1/num1) + (1/num2) + (1/num3));
               
               System.out.println("Média Harmônica : "+op1);
          }
          else
          {
               if (opcao == 2)
               {
                    op2 = Math.cbrt(num1 * num2 * num3);
                    
                    System.out.println("Média Geométrica: "+op2);
               }
               else
               {
                    op3 = (num1 + num2 + num3) / 3;
                    
                    System.out.println("Média Aritmética Simples: "+op3);
               }
          }
     }
}

