public class revisao03
{
  public static void main (String[] args)
  {
    double raio = Entrada.leiaDouble("Digite o raio do cilindro:");
    double altura = Entrada.leiaDouble("Digite a altura do cilindro:");
    
    System.out.println("Volume do cilindro = "+(Math.PI*(Math.pow(raio,2))*altura));
    System.out.println("�rea do cilindro = "+((2*Math.PI*raio*altura)+((2*Math.PI)*Math.pow(raio,2))));
  }
}

                       
    