public class Exercicio1
{
  public static void main(String[] args)
  {
    double n1, n2, n3, n4, r1;
      
    n1 = Entrada.leiaDouble("Digite a nota 1:");
    n2 = Entrada.leiaDouble("Digite a nota 2:");
    n3 = Entrada.leiaDouble("Digite a nota 3:");
    n4 = Entrada.leiaDouble("Digite a nota 4:");
    
    r1 = (n1 + n2 + n3 + n4) / 4;
    
    if (r1 >= 7)
    {
      System.out.println("Sua nota foi:"+r1 +" Você foi aprovado!");
    }
    else
    {
      System.out.println("Sua nota foi:"+r1 +" Você foi reprovado!");
    }
  }
}
