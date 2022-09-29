// Author: Auguto Fritz
public class OrdenarNTeste
{
  public static void main(String[] args)
  {
    int n1, n2, n3, n4, a1, a2, a3, a4, b1, b2 ,b3 ,b4, c1, c2, c3, c4, d1, d2 ,d3 ,d4;
    
    n1 = Entrada.leiaInt("Digite o 1ºNúmero:");
    n2 = Entrada.leiaInt("Digite o 2ºNúmero:");
    n3 = Entrada.leiaInt("Digite o 3ºNúmero:");
    n4 = Entrada.leiaInt("Digite o 4ºNúmero:");
    
    a1 = 0;
    a2 = 0;
    a3 = 0;
    a4 = 0;
    
    b1 = 0;
    b2 = 0;
    b3 = 0;
    b4 = 0;
    
    c1 = 0;
    c2 = 0;
    c3 = 0;
    c4 = 0;
    
    d1 = 0;
    d2 = 0;
    d3 = 0;
    d4 = 0;
    
    if (n1 < n2 && n1 < n3 && n1 < n4)
    {
      a1 = n1;
    }
    else
    {
      if (n1 > n2 && n1 < n3 && n1 < n4)
      {
        a2 = n1;
      }
      else
      {
        if (n1 > n3 && n1 < n2 && n1 < n4)
        {
          a2 = n1;
        }
        else
        {
          if (n1 > n4 && n1 < n2 && n1 < n3)
          {
            a2 = n1;
          }
          else
          {
            if (n1 > n2 && n1 > n3 && n1 < n4)
            {
              a3 = n1;
            }
            else
            {
              if (n1 > n2 && n1 > n4 && n1 < n3)
              {
                a3 = n1;
              }
              else
              {
                if (n1 > n3 && n1 > n4 && n1 < n2)
                {
                  a3 = n1;
                }
                else
                {
                  if (n1 > n2 && n1 > n3 && n1 > n4)
                  {
                    a4 = n1;
                  }
                }
              }
            }
          }
        }
      }
    }
    
    
    if (n2 < n1 && n2 < n3 && n2 < n4)
    {
      b1 = n2;
    }
    else
    {
      if (n2 > n1 && n2 < n3 && n2 < n4)
      {
        b2 = n2;
      }
      else
      {
        if (n2 > n3 && n2 < n1 && n2 < n4)
        {
          b2 = n2;
        }
        else
        {
          if (n2 > n4 && n2 < n1 && n2 < n3)
          {
            b2 = n2;
          }
          else
          {
            if (n2 > n1 && n2 > n3 && n2 < n4)
            {
              b3 = n2;
            }
            else
            {
              if (n2 > n1 && n2 > n4 && n2 < n3)
              {
                b3 = n2;
              }
              else
              {
                if (n2 > n3 && n2 > n4 && n2 < n1)
                {
                  b3 = n2;
                }
                else
                {
                  if (n2 > n1 && n2 > n3 && n2 > n4)
                  {
                    b4 = n2;
                  }
                }
              }
            }
          }
        }
      }
    }
    
    
    if (n3 < n2 && n3 < n1 && n3 < n4)
    {
      c1 = n3;
    }
    else
    {
      if (n3 > n2 && n3 < n1 && n1 < n4)
      {
        c2 = n3;
      }
      else
      {
        if (n3 > n1 && n3 < n2 && n3 < n4)
        {
          c2 = n3;
        }
        else
        {
          if (n3 > n4 && n3 < n2 && n3 < n1)
          {
            c2 = n3;
          }
          else
          {
            if (n3 > n2 && n3 > n1 && n3 < n4)
            {
              c3 = n3;
            }
            else
            {
              if (n3 > n2 && n3 > n4 && n3 < n1)
              {
                c3 = n3;
              }
              else
              {
                if (n3 > n1 && n3 > n4 && n3 < n2)
                {
                  c3 = n3;
                }
                else
                {
                  if (n3 > n2 && n3 > n1 && n1 > n4)
                  {
                    c4 = n3;
                  }
                }
              }
            }
          }
        }
      }
    }
    
    
    if (n4 < n2 && n4 < n3 && n4 < n1)
    {
      d1 = n4;
    }
    else
    {
      if (n4 > n2 && n4 < n3 && n4 < n1)
      {
        d2 = n4;
      }
      else
      {
        if (n4 > n3 && n4 < n2 && n4 < n1)
        {
          d2 = n4;
        }
        else
        {
          if (n4 > n1 && n4 < n2 && n4 < n3)
          {
            d2 = n4;
          }
          else
          {
            if (n4 > n2 && n4 > n3 && n4 < n1)
            {
              d3 = n4;
            }
            else
            {
              if (n4 > n2 && n4 > n1 && n4 < n3)
              {
                d3 = n4;
              }
              else
              {
                if (n4 > n3 && n4 > n1 && n4 < n2)
                {
                  d3 = n4;
                }
                else
                {
                  if (n4 > n2 && n4 > n3 && n4 > n1)
                  {
                    d4 = n4;
                  }
                }
              }
            }
          }
        }
      }
    }
    System.out.println("Ordem crescente:" +a1 +b1 +c1 +d1 +a2 +b2 +c2 +d2 +a3 +b3 +c3 +d3 +a4 +b4 +c4 +d4);
  }
}