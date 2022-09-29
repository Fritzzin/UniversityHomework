package Deque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augusto.fritz
 */
public class TestMyDeque {

    public static void main(String[] args) {
        MyDeque d = new MyDeque();
        d.add(1);
        d.add(2);
        d.addFirst(3);
        d.addFirst(4);
        System.out.println("d= " + d);
        System.out.println("size= " + d.size());
        try {
            System.out.println("first= " + d.first());
            System.out.println("last= " + d.last());
            System.out.println(d.remove());
            System.out.println(d.removeLast());
            System.out.println(d.removeLast());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("d= " + d);
    }
}
