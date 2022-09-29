public class exer01
{
     public static void main(String[] args)
     {
          double[] n = new double [10];
          double soma=0;
          double media=0;
          for(int c=0;c<10;c++)
          {
               n[c]=Entrada.leiaDouble("Digite o "+(c+1)+"º número");
               soma += n[c];
          }
          media = soma / 10;
          
          System.out.println("Desvio Padrão = "+desvio(media,n));
     }
 
     public static double desvio(double media, double[] n)
     {
          double var=0;
          for(int c=0;c<10;c++)
          {
               var += Math.pow((n[c]-media),2);
          }
          var = var/9;
          var = Math.sqrt(var);
          return var;
     }
}