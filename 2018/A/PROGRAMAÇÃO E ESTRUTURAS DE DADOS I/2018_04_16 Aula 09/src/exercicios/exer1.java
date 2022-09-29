/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

//01. Implement a method that receives a string and counts the number of occurrences of each letter within it, ignoring any other characters. Then print the resulting histogram of character frequency.
import java.util.*;

/**
 *
 * @author Augus
 */
public class exer1 {

    public static void main(String[] args) {
        String userInput = "tstestee";
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();

        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            if (m.containsKey(c)) // letra está presente?
            {
                m.put(c, m.get(c) + 1); // sim: incrementa contagem
            } else {
                m.put(c, 1); // não: insere primeira ocorrência
            }
        }
        System.out.println(m);
    }
}
