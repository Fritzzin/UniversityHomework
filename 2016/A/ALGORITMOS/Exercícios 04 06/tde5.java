/*
 * @Author: Augusto Fritz
 */

public class tde5
{
     public static void main(String[] args)
     {
          double idade = 1;
          double contador = 0;
          double soma = 0;
          double menor = 200; 
          double maior = 0;
          while (idade != 0)
          {    
               
               idade = Entrada.leiaInt("Digite a idade do estudante");
               soma = soma + idade;
               if (idade != 0)
               {
               menor = Math.min(menor,idade);
               maior = Math.max(maior,idade); 
               contador = contador + 1;
               }
               
          }
          System.out.println("A m�dia das idades � igual a:..."+soma / contador);
          System.out.println("A menor idade �:................"+menor);
          System.out.println("A maior idade �:................"+maior);
     }
}