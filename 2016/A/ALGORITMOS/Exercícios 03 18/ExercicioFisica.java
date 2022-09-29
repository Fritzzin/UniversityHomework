// Author: Auguto Fritz
public class ExercicioFisica
{
     public static void main(String[] args)
     {
          double trem, tunel, velocidade, velocidadeS;
          
          trem = Entrada.leiaInt("Digite o tamanho do trem(Metros):");
          tunel = Entrada.leiaInt("Digite o tamanho do túnel(Metros):");
          velocidade = Entrada.leiaInt("Digite a velocidade (KM/h):");
          
          velocidadeS = velocidade / 3.6;
          
          System.out.println("O trem levou : "+ (trem + tunel / velocidadeS));
     }
}