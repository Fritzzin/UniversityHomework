public class exercício9
{
     public static void main(String[] args)
     {
          String[] prod = new String [10];
          int [] cod = new int [10];
          double [] valor = new double [10];
          double [] valorNovo = new double [10];
          
          for (int c=0;c<10;c++)
          {
               prod[c] = Entrada.leiaString("Nome do "+(c+1)+"º produto:");
               cod[c] = Entrada.leiaInt("Código do "+(c+1)+"º produto:");
               valor[c] = Entrada.leiaInt("Valor do "+(c+1)+"º produto:");
          }
          
          for (int c=0;c<10;c++)
          {
               if(cod[c] % 2 == 0 && valor[c] > 1000)
               {
                    valorNovo[c] = valor[c] * 1.20;
               }
               if (cod[c] % 2 == 0 && valor[c] < 1000)
               {
                    valorNovo[c] = valor[c] * 1.15;
               }
               if(valor[c] > 1000 && cod[c] % 2 != 0)
               {
                    valorNovo[c] = valor[c] * 1.10;
               }
          }
         
          for(int c=0;c<10;c++)
          {
          System.out.println("Nome : "+prod[c]);
          System.out.println("Código : "+cod[c]);
          System.out.println("Valor : "+valor[c]);
          if(cod[c] % 2 == 0|| valor[c] > 1000)
          {
          System.out.println("Valor Novo : "+valorNovo[c]);
          }
          System.out.println();
          }
     }
}
