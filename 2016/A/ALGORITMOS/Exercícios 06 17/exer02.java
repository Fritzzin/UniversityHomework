public class exer02
{
     public static void main(String[] args)
     {
          String[] extenso = {"Dez","Vinte","Trinta","Quarenta","Cinquenta","Sessenta","Setenta","Oitenta","Noventa"}; 
          int n = Entrada.leiaInt("Digite um número no intervalo de 10 à 90 :");
          if(n%10==0 && n>=10 && n<=90)
          {
               System.out.println(extenso[((n/10)-1)]);
          }
          else
          {
               System.out.println("Tente novamente.");
          }
     }
}