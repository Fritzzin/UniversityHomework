// Augusto Fritz
public class Exerc�cio2
{
     public static void main(String[] args)
     {
          int opcao, contagem;
          double num,op1,op2,op3,mh,mg,soma;
          contagem = 0;
          num = 1;
          mh = 0;
          mg = 1;
          soma = 0;
          opcao = Entrada.leiaInt("Digite uma op��o: \n"+
                                  "1. M�dia Harm�nica \n"+
                                  "2. M�dia Geom�trica \n"+
                                  "3. M�dia Aritm�tica Simples");
          
          num = Entrada.leiaDouble("Digite o "+ (contagem+1) +"� n�mero:");          
          
          while (num !=0)
          {    
               
               mh = mh + (1/num);
               mg = mg * num;
               soma = soma + num;
               contagem = contagem + 1;              
               num = Entrada.leiaDouble("Digite o "+ (contagem+1) +"� n�mero:");
          }
          
          if (opcao == 1) // media harmonica
          {
               op1 = contagem / mh;
               
               System.out.println("M�dia Harm�nica : "+op1);
          }
          else
          {
               if (opcao == 2) // media geometrica
               {
                    op2 = Math.cbrt(mg);
                    
                    System.out.println("M�dia Geom�trica: "+op2);
               }
               else // media simples
               {
                    op3 = soma / contagem;
                    
                    System.out.println("M�dia Aritm�tica Simples: "+op3);
               }
          }
     }
}

