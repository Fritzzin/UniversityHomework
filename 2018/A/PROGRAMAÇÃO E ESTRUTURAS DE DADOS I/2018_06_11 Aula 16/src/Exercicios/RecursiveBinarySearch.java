/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Random;

/**
 *
 * @author augusto.fritz
 */
public class RecursiveBinarySearch {

    // procura o valor 'v' dentro do array 'a'
    // retorna o número de comparações feitas
    public static int binary_search(int[] a, int v) {
        return binary_search(a, 0, a.length - 1, v);
    }

    public static int binary_search(int[] a, int start, int end, int target) {
        int middle = (start + end) / 2;
        if (end < start) {
            return -1;
        }

        if (target == a[middle]) {
            return middle;
        } else if (target < a[middle]) {
            return binary_search(a, start, middle - 1, target);
        } else {
            return binary_search(a, middle + 1, end, target);
        }
    }

    public static void main(String[] args) {
        for (int n = 10; n <= 1000; n += 10) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = i;
            }

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
