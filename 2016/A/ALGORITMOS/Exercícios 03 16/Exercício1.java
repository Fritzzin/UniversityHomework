// Augusto Fritz
public class Exerc�cio1
{
     public static void main(String[] args)
     {
          int opcao;
          double num1,num2,num3;
          double op1,op2,op3;
          
          opcao = Entrada.leiaInt("Digite uma op��o: \n"+
                                  "1. M�dia Harm�nica \n"+
                                  "2. M�dia Geom�trica \n"+
                                  "3. M�dia Aritm�tica Simples");
          
          num1 = Entrada.leiaDouble("Digite o 1� n�mero");
          num2 = Entrada.leiaDouble("Digite o 2� n�mero");
          num3 = Entrada.leiaDouble("Digite o 3� n�mero");
          
          if (opcao == 1)
          {
               op1 = 3 / ((1/num1) + (1/num2) + (1/num3));
               
               System.out.println("M�dia Harm�nica : "+op1);
          }
          else
          {
               if (opcao == 2)
               {
                    op2 = Math.cbrt(num1 * num2 * num3);
                    
                    System.out.println("M�dia Geom�trica: "+op2);
               }
               else
               {
                    op3 = (num1 + num2 + num3) / 3;
                    
                    System.out.println("M�dia Aritm�tica Simples: "+op3);
               }
          }
     }
}

