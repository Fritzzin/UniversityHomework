public class revisao04
{
  public static void main (String[] args)
  {
    int[] cordX = new int[10];
    int[] cordY = new int[10];
    
    for (int c=0;c<10;c++)
    {
      cordX[c] = Entrada.leiaInt((c+1)+"� Coordenada X:");
      cordY[c] = Entrada.leiaInt((c+1)+"� Coordenada Y:");
    }
    
    for (int c=0;c<9;c++)
    {
      System.out.println("A dist�ncia entre o "+(c+1)+"� e o "+(c+2)+"� ponto � : "+(distancia(cordX,cordY,c)));
    }
  }
  
  public static double distancia (int[] cordX, int[] cordY, int c)
  {
    double distancia = Math.sqrt((Math.pow((cordX[c+1] - cordX[c]),2) + (Math.pow((cordY[c+1] - cordY[c]),2))));
    return distancia;
  }
}