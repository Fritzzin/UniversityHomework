/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02;

/**
 *
 * @author augusto.fritz
 */
public class TestListing {

    public static void main(String[] args) {
        String folderPath = "/home/augusto.fritz/Downloads";
        Listing list = new Listing();
        list.listByDate(folderPath);
        list.listBySize(folderPath);
    }
}
