public class revisao01
{
  public static void main (String[] args)
  {
    int cordX = Entrada.leiaInt("Coordenada X:");
    int cordY = Entrada.leiaInt("Coordenada Y:");
    
    if (cordX > 0 && cordY > 0)
    {
      System.out.println("A coordenada "+cordX+","+cordY+" est� localizada no 1� quadrante.");
    }
    
    if (cordX < 0 && cordY > 0)
    {
      System.out.println("A coordenada "+cordX+","+cordY+" est� localizada no 2� quadrante.");
    }
    
    if (cordX < 0 && cordY < 0)
    {
      System.out.println("A coordenada "+cordX+","+cordY+" est� localizada no 3� quadrante.");
    }
    
    if (cordX > 0 && cordY < 0)
    {
      System.out.println("A coordenada "+cordX+","+cordY+" est� localizada no 4� quadrante.");
    }
    
    if ((cordX > 0 || cordX < 0) && cordY == 0)
    {
      System.out.println("A coordenada "+cordX+","+cordY+" est� localizada eixo das abscissas.");
    }
    
    if (cordX == 0 && (cordY > 0 || cordY < 0))
    {
      System.out.println("A coordenada "+cordX+","+cordY+" est� localizada eixo das ordenadas.");
    }
  }
}
    
    
    