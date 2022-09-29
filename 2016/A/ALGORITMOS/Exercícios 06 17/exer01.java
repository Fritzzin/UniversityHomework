public class exer01
{
     public static void main(String[] args)
     {
          String[] extenso = {"Zero","Um","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove"}; 
          int n = Entrada.leiaInt("Digite um número no intervalo de 0 à 9 :");
          if (n<0 || n>9)
          {
               System.out.println("Tente novamente.");
          }
          else
          {
               System.out.println(extenso[n]);
          }
     }
}
