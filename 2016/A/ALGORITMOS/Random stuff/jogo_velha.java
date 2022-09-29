public class jogo_velha
{
     public static void main (String[] args)
     {
          char[][] jogo = new char [3][3];
          char marcador = '_';
          int jogador = 0;
          int resultado = 0;
          int jogadas = 0;
          int resposta = 0;
          
          for (int c=0;c<3;c++)
          {
               for (int i=0;i<3;i++)
               {
                    jogo[c][i] = '_';
               }
          }
          
          for (int c=0;c<3;c++)// Print jogo
          {
               for (int i=0;i<3;i++)
               { 
                    System.out.print(jogo[c][i]+" ");
               }
               System.out.println();  
          }
          System.out.println();
          System.out.println("-------------------");
          
          while( jogadas < 9)
          {
               if (jogadas % 2 == 0 || jogadas == 0) // Qual jogador será o próximo
               {
                    marcador = 'X';
               }
               else
               {
                    marcador = 'O';
               }
               
               
               while(resposta == 0) // Jogadores
               {
                    jogador = Entrada.leiaInt(marcador+" : Digite a linha e a coluna: \n"+"Número de jogadas = "+jogadas);
                    
                    int linha = (jogador / 10)-1;
                    int coluna = (jogador % 10)-1;
                    if (linha >= 0 && linha <= 2 && coluna >=0 && coluna <= 2 && jogo[linha][coluna] == '_') // Verificação da jogada
                    {
                         jogo[linha][coluna] = marcador;
                         jogadas++;
                         resposta = 1;
                    }
                    else
                    {
                         System.out.println("Tente novamente!");
                    }
               }
               resposta = 0;
               
               
               for (int c=0;c<3;c++)
               {
                    for (int i=0;i<3;i++)
                    { 
                         System.out.print(jogo[c][i]+" ");
                    }
                    System.out.println();  
               }
               System.out.println();
               System.out.println("-------------------");    
          }
     }
}
