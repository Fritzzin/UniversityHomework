// Augusto Fritz
public class Exercício2
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
          opcao = Entrada.leiaInt("Digite uma opção: \n"+
                                  "1. Média Harmônica \n"+
                                  "2. Média Geométrica \n"+
                                  "3. Média Aritmética Simples");
          
          num = Entrada.leiaDouble("Digite o "+ (contagem+1) +"º número:");          
          
          while (num !=0)
          {    
               
               mh = mh + (1/num);
               mg = mg * num;
               soma = soma + num;
               contagem = contagem + 1;              
               num = Entrada.leiaDouble("Digite o "+ (contagem+1) +"º número:");
          }
          
          if (opcao == 1) // media harmonica
          {
               op1 = contagem / mh;
               
               System.out.println("Média Harmônica : "+op1);
          }
          else
          {
               if (opcao == 2) // media geometrica
               {
                    op2 = Math.cbrt(mg);
                    
                    System.out.println("Média Geométrica: "+op2);
               }
               else // media simples
               {
                    op3 = soma / contagem;
                    
                    System.out.println("Média Aritmética Simples: "+op3);
               }
          }
     }
}

