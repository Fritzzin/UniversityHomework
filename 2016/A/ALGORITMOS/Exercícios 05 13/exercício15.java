public class exercício15
{
     public static void main(String[] args)
     {
         String [] nome = new String [10];
         int [] dvd = new int[10];
         
         for(int c=0;c<10;c++)
         {
             nome[c] = Entrada.leiaString("Digite o nome do "+(c+1)+"º cliente:");
             dvd[c] = Entrada.leiaInt("Digite o número de locações em 2011:");
         }
         for(int c=0;c<10;c++)
         {
             System.out.println("Nome: "+nome[c]+"   Quantidade de locações grátis: "+(dvd[c]/10));
         }
     }
}


         
         