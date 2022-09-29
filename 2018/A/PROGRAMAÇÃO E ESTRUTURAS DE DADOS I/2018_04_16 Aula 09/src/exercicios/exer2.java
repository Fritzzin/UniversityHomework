/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.*;

//02. Implement a method that receives an array of strings of different sizes, but only stores the first string of the same length found.
//At the end of the method you should print the selected strings. For example, if the input is {"me", "ball", "is", "home", "you", "test", "no"},
//the output should be "me", "ball" and "you". 
/**
 *
 * @author Augus
 */
public class exer2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("me");
        list.add("ball");
        list.add("is");
        list.add("home");
        list.add("you");
        list.add("test");
        list.add("no");

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < list.size(); i++) {
            String c = list.get(i);
            if (map.containsValue(c.length())) {
            } else {
                map.put(c, c.length());
            }
        }
        System.out.println(map);
    }
}
