public class Exercicio2
{
  public static void main(String[] args)
  {
    double n1, n2, r1;
    
    n1 = Entrada.leiaDouble("Digite a nota 1:");
    n2 = Entrada.leiaDouble("Digite a nota 2:");
    
    r1 = (n1 + n2) / 2;
    
    if (r1 >=7)
    {
      System.out.println("Sua m�dia foi:"+r1 +" Voc� foi aprovado!");
    }
    else
    {
      if (r1 >= 3)
      {
        System.out.println("Sua m�dia foi:"+r1 +" Voc� est� em exame!");
      }
      else
      {
        System.out.println("Sua m�dia foi:"+r1 +" Voc� foi reprovado!");
      }
    }
  }
}
