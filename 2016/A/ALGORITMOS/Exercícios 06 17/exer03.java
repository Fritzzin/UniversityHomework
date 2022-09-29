public class exer03
{
     public static void main(String[] args)
     {
          int primeiro = 0;
          int segundo = 0;
          int n = Entrada.leiaInt("Digite um número no intervalo de (0,99) :");
          
          if(n<10 && n>0)
          {
               System.out.println(exer1(n));
          }
          else
          {
               if(n>9 && n<100)
               {
                    primeiro = n / 10;
                    segundo = n % 10;
               }
               if(n>10 && n<20)
               {
                    System.out.println(exer2v2(segundo));
               }
               else
               {
                    if(n%10==0)
                    {
                         System.out.println(exer2(primeiro));
                    }
                    else
                    {
                         System.out.println(exer2(primeiro)+" e "+exer1(segundo));
                    }
               }
          }
     }
     
     public static String exer1 (int n)//0 à 9
     {
          String[] extenso = {"Zero","Um","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove"}; 
          return extenso[n];
     }
     
     
     public static String exer2 (int primeiro)//11 à 19
     {
          String[] extenso = {"Dez","Vinte","Trinta","Quarenta","Cinquenta","Sessenta","Setenta","Oitenta","Noventa"}; 
          return extenso[primeiro-1];
     }
     
     public static String exer2v2 (int segundo)//10 à 90
     {
          String[] extenso = {"Onze","Doze","Treze","Quatorze","Quinze","Dezesseis","Dezessete","Dezoito","Dezenove"};
          return extenso[segundo-1];
     }
}