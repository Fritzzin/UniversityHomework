// Augusto Fritz
public class ValidarCPF
{
     public static void main(String[] args)
     {
          String cpf = Entrada.leiaString("Digite o CPF");
          
          int calc1 = 0;
          int calc2 = 0;
          int cont1 = 10;
          int cont2 = 0;
          int cont3 = 11;
          int cont4 = 0;
          int n1 = 0;
          int n2 = 0;
          int y1 = 0;
          int y2 = 0;
          while (cont1 > 1)
          {
               calc1 = calc1 + (cpf.charAt(cont2) * cont1);
               
               cont1 = cont1 - 1;
               cont2 = cont2 + 1;
          }
          y1 = 
          if ((calc1 % 11) < 2)
          {
               n1 = 0;
          }
          else
          {
               n1 = 11 - y1;
          }
          while (cont3 > 1)
          {
               calc2 = calc2 + (cpf.charAt(cont4) * cont2);
               
               cont3 = cont3 - 1;
               cont4 = cont4 + 1;
          }
          
          if ((calc2 % 11) < 2)
          {
               n2 = 0;
          }
          else
          {
               n2 = 11 - (calc2 % 11);
          }
          System.out.println(n1+" "+n2);
     }
}

          
          