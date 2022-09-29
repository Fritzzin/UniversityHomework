public class exer03
{
     public static void main(String[] args)
     {
          char opcao = ' ';
          int x = 0;
          int y = 0;
          int cont = 0;
          int[] cod = new int [1000];
          String op1 = "";
          String op2 = "";
          
          while(opcao != '3')
          {
               opcao = Entrada.leiaChar("M E N U \n"+
                                        "1) Criptografar uma mensagem\n"+
                                        "2) Descriptografar uma mensagem\n"+
                                        "3) Desligar o programa");
               
               if(opcao == '1') // Criptografar
               {
                    op1 = Entrada.leiaString("Digite uma frase ou palavra a ser criptografada:");
                    
                    for(int c=0; c < op1.length() ; c++)
                    {
                         x = (int)op1.charAt(c);
                         System.out.print(x+" ");
                    }
                    System.out.println();
               }
               
               if(opcao == '2') // Descriptografar
               {
                    op2 = Entrada.leiaString("Digite o codigo a ser descriptografado:");
                         op2.split(" ");
                         
                         while(
                         cod[cont] = Integer.parseInt(op2);
                         
                         if(op2 != "-1")
                         {
                              System.out.print((char)cod[cont]);
                              cont++;
                         }
                         op2 = Entrada.leiaString("Digite o "+(cont+1)+"º digito:\n"+
                                                  "Digite -10 para parar.");
                    }
                    System.out.println();
               }
          }
     }
}

