public class exerc�cio15
{
     public static void main(String[] args)
     {
         String [] nome = new String [10];
         int [] dvd = new int[10];
         
         for(int c=0;c<10;c++)
         {
             nome[c] = Entrada.leiaString("Digite o nome do "+(c+1)+"� cliente:");
             dvd[c] = Entrada.leiaInt("Digite o n�mero de loca��es em 2011:");
         }
         for(int c=0;c<10;c++)
         {
             System.out.println("Nome: "+nome[c]+"   Quantidade de loca��es gr�tis: "+(dvd[c]/10));
         }
     }
}


         
         