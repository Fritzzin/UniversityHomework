public class Desafio1
{
  public static void main(String[] args)
  {
    int r1,r2,rgeral;
    
    r1 = Entrada.leiaInt("Qual a sua idade?");
    r2 = Entrada.leiaInt("Qual a idade do seu chefe?");
    
    rgeral = r1 + r2;
    
    System.out.println("A soma das idades é:"+rgeral);
  }
}

   