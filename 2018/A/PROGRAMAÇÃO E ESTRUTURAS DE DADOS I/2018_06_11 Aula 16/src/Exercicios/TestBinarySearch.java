import java.util.Random;

public class TestBinarySearch
{
  // procura o valor 'v' dentro do array 'a'
  // retorna o número de comparações feitas
  public static int binary_search(int[] a, int v)
  {
    int c = 0;
    int begin = 0, end = a.length - 1;
    while (begin <= end) {
      int middle = (begin + end) / 2;
      c++;
      if (v == a[middle]) {
        // já encontrou, pode sair
        break;
      }
      c++;
      if (v < a[middle]) {
        // se 'v' está do lado esquerdo -> atualiza 'end'
        end = middle - 1;
      }
      else {
        // caso contrário -> atualiza 'begin'
        begin = middle + 1;
      }
    }
    return c;
  }

  // imprime o número médio de comparações feitas
  // para cada array de tamanho 'n'
  public static void main(String[] args)
  {
    for (int n = 10; n <= 1000; n += 10) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) { array[i] = i; }

      int trials = 1000;

      Random r = new Random(n); // semente é o valor de 'n'
      double sum = 0; 
      for (int i = 0; i < trials; i++) {
        sum += binary_search(array, r.nextInt(array.length));
      }
      System.out.println(n + "," + sum / trials);
    }
  }
}

