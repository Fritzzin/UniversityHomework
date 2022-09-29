// Augusto Fritz
public class Xadrez
{
     public static void main(String[] args)
     {
          int horaI, minutosI, horaF, minutosF, calculoHora, calculoMinutos;
          
          horaI = Entrada.leiaInt("Digite a hora inicial (0 a 23):");
          minutosI = Entrada.leiaInt("Digite os minutos iniciais (0 a 60):");          
          horaF = Entrada.leiaInt("Digite a hora final (0 a 23):");
          minutosF = Entrada.leiaInt("Digite os minutos finais (0 a 60):");
          
          if (horaF <= horaI)
          {
               calculoHora = (23 - horaI) + horaF;
          }
          else
          {
               calculoHora = horaF - horaI;
          }
          
          if (minutosF <= minutosI)
          {
               calculoMinutos = (60 - minutosI) + minutosF;
          }
          else
          {
               calculoMinutos = minutosF + minutosI;
          }
          
          System.out.println("A partida durou "+calculoHora +" horas e "+calculoMinutos +" minutos.");
     }
}

          
          